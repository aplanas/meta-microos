SUMMARY = "Create context-sensitive return values"
DESCRIPTION = "Usually, when you need to create a subroutine that returns different values \
in different contexts (list, scalar, or void), you write something like: \
 \
    sub get_server_status { \
        my ($server_ID) = @_; \
 \
         \
        my %server_data = _ascertain_server_status($server_ID); \
 \
         \
         \
        if (wantarray()) { \
            return @server_data{ qw(name uptime load users) }; \
        } \
        if (defined wantarray()) { \
            return $server_data{load}; \
        } \
        if (!defined wantarray()) { \
            carp 'Useless use of get_server_status() in void context'; \
            return; \
        } \
        else { \
            croak q{Bad context! No biscuit!}; \
        } \
    } \
 \
That works okay, but the code could certainly be more readable. In its \
simplest usage, this module makes that code more readable by providing \
three subroutines--'LIST()', 'SCALAR()', 'VOID()'--that are true only when \
the current subroutine is called in the corresponding context: \
 \
    use Contextual::Return; \
 \
    sub get_server_status { \
        my ($server_ID) = @_; \
 \
         \
        my %server_data = _ascertain_server_status($server_ID); \
 \
         \
         \
        if (LIST)   { return @server_data{ qw(name uptime load users) } } \
        if (SCALAR) { return $server_data{load}                         } \
        if (VOID)   { print '$server_data{load}\\n'                      } \
        else        { croak q{Bad context! No biscuit!}                 } \
    }"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.004014"

RPM_NAME = "perl-Contextual-Return-0.004014-1.23.noarch.rpm"
RPM_HASH = "d98dfa7d20cb7cb8c4a258b6fa6ea955ba8870e30a59a5012b2daa20d1dfda1879f889b9f483aafa9b63ca18539dc694575720bf5a5914e6862bcebbd297e2af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Contextual::Return) \
perl(Contextual::Return::Failure) \
perl(Contextual::Return::Lvalue) \
perl(Contextual::Return::Value) \
perl(DB) \
perl-Contextual-Return"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Want) \
perl(version)"

inherit rpm
