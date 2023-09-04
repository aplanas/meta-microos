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

RPM_NAME = "perl-autobox-3.0.1-1.27.aarch64.rpm"
RPM_HASH = "a2ae47b74afb0faaa3f9fa5a7c31a37e3ec173835ffaf3bdf4bc2d763018db5e121d5242008df3c62014eaed0305a49eb5f298671c151356eb86f4120030e5d5"

RPROVIDES:${PN} += "perl-autobox \
perl-autobox--universal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Scope--Guard \
perl-version"

inherit rpm
