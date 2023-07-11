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

RPM_NAME = "perl-autobox-3.0.1-1.26.aarch64.rpm"
RPM_HASH = "78290be304ea685560d2a97dbc80bca51186690d4495e7e84097f114b676f76236824735e71c764f5575ec202a2080ca96d2f2b2f4c594e8bb3f209b521360eb"

RPROVIDES:${PN} += "perl-autobox \
perl-autobox--universal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Scope--Guard \
perl-version"

inherit rpm
