SUMMARY = "Meatier versions of caller"
DESCRIPTION = "* caller_cv($level) \
 \
'caller_cv' gives you the coderef of the subroutine being invoked at the \
call frame indicated by the value of $level \
 \
* caller_args($level) \
 \
Returns the arguments passed into the caller at level $level \
 \
* caller_vars( $level, $names ) \
  =item called_with($level, $names) \
 \
'called_with' returns a list of references to the original arguments to the \
subroutine at $level. if $names is true, the names of the variables will be \
returned instead \
 \
constants are returned as 'undef' in both cases \
 \
* called_as_method($level) \
 \
'called_as_method' returns true if the subroutine at $level was called as a \
method."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.07"

RPM_NAME = "perl-Devel-Caller-2.07-1.1.aarch64.rpm"
RPM_HASH = "8b15026ff536485537bf775fec1963b4c2b527cc8efda58248ddd892fa97c4ac1cbaf5f73e3a90dd05839bd01e01a129d068369bd428db418c560ba41a790514"

RPROVIDES:${PN} += "perl(DB) \
perl(Devel::Caller) \
perl-Devel-Caller \
perl-Devel-Caller(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(PadWalker)"

inherit rpm
