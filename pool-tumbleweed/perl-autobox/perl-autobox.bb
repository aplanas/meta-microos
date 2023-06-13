SUMMARY = "Call Methods On Native Types"
DESCRIPTION = "The autobox pragma allows methods to be called on integers, floats, \
strings, arrays, hashes, and code references in exactly the same manner as \
blessed references. \
 \
Autoboxing is transparent: values are not blessed into their (user-defined) \
implementation class (unless the method elects to bestow such a blessing) - \
they simply use its methods as though they are. \
 \
The classes (packages) into which the native types are boxed are fully \
configurable. By default, a method invoked on a non-object value is assumed \
to be defined in a class whose name corresponds to the 'ref()' type of that \
value - or SCALAR if the value is a non-reference."
LICENSE = "Artistic-2.0"

PV = "3.0.1"

RPM_NAME = "perl-autobox-3.0.1-1.25.aarch64.rpm"
RPM_HASH = "c583fb9843d67bf2718ec6523925ea5c03b5816fcffa3fd6d1aea44d87628f19aa17e6c9c6c3543f855b11f01f011375049ee965ff3d7aea6a6ae077a66442a2"

RPROVIDES:${PN} += "perl(autobox) \
perl(autobox::universal) \
perl-autobox \
perl-autobox(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Scope::Guard) \
perl(version)"

inherit rpm
