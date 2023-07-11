SUMMARY = "Generate fast XS accessors without runtime compilation"
DESCRIPTION = "Class::XSAccessor implements fast read, write and read/write accessors in \
XS. Additionally, it can provide predicates such as 'has_foo()' for testing \
whether the attribute 'foo' exists in the object (which is different from \
'is defined within the object'). It only works with objects that are \
implemented as ordinary hashes. the Class::XSAccessor::Array manpage \
implements the same interface for objects that use arrays for their \
internal representation. \
 \
Since version 0.10, the module can also generate simple constructors \
(implemented in XS). Simply supply the 'constructor => 'constructor_name'' \
option or the 'constructors => ['new', 'create', 'spawn']' option. These \
constructors do the equivalent of the following Perl code: \
 \
  sub new { \
    my $class = shift; \
    return bless { @_ }, ref($class)||$class; \
  } \
 \
That means they can be called on objects and classes but will not clone \
objects entirely. Parameters to 'new()' are added to the object. \
 \
The XS accessor methods are between 3 and 4 times faster than typical \
pure-Perl accessors in some simple benchmarking. The lower factor applies \
to the potentially slightly obscure 'sub set_foo_pp {$_[0]->{foo} = \
$_[1]}', so if you usually write clear code, a factor of 3.5 speed-up is a \
good estimate. If in doubt, do your own benchmarking! \
 \
The method names may be fully qualified. The example in the synopsis could \
have been written as 'MyClass::get_foo' instead of 'get_foo'. This way, \
methods can be installed in classes other than the current class. See also: \
the 'class' option below. \
 \
By default, the setters return the new value that was set, and the \
accessors (mutators) do the same. This behaviour can be changed with the \
'chained' option - see below. The predicates return a boolean. \
 \
Since version 1.01, 'Class::XSAccessor' can generate extremely simple \
methods which just return true or false (and always do so). If that seems \
like a really superfluous thing to you, then consider a large class \
hierarchy with interfaces such as the PPI manpage. These methods are \
provided by the 'true' and 'false' options - see the synopsis. \
 \
'defined_predicates' check whether a given object attribute is defined. \
'predicates' is an alias for 'defined_predicates' for compatibility with \
older versions of 'Class::XSAccessor'. 'exists_predicates' checks whether \
the given attribute exists in the object using 'exists'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.19"

RPM_NAME = "perl-Class-XSAccessor-1.19-3.38.aarch64.rpm"
RPM_HASH = "f49d99096d488d95ed50947e5fe1a98ae07265c0040deb5bd4a0cbd7e3fdab64cace232657812caf975ccb109383d2a70de0fb5ea301797d72445ee5865d89ce"

RPROVIDES:${PN} += "perl-Class--XSAccessor \
perl-Class--XSAccessor--Array \
perl-Class-XSAccessor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
