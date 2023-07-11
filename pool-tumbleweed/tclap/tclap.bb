SUMMARY = "Templatized C++ Command Line Parser"
DESCRIPTION = "TCLAP is a small, flexible library that provides a simple interface for \
defining and accessing command line arguments. It was intially inspired by the \
user friendly CLAP libary. The difference is that this library is templatized, \
so the argument class is type independent. Type independence avoids \
identical-except-for-type objects, such as IntArg, FloatArg, and StringArg. \
While the library is not strictly compliant with the GNU or POSIX standards, it \
is close."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "tclap-1.2.5-3.2.aarch64.rpm"
RPM_HASH = "8ea7d44cea2a827d6d094e6eb9e49635a3b48a4ace20c07920266bc2a5ff1a45bee282d5326e2524132ed52c719190b02774b93cc70e822a7556f20c39284c3a"

RPROVIDES:${PN} += "libtclap \
libtclap-devel \
pkgconfig-tclap \
tclap"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
