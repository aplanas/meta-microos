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

RPM_NAME = "tclap-1.2.5-3.1.aarch64.rpm"
RPM_HASH = "75d0096fbe62a959fc9ed75d82ad060f66a8a44a1715474bce586179939fc8b7dd6473ceca62d996d15e23234f44768fdba0a5bf8710bb4b40ea6c208b87bb55"

RPROVIDES:${PN} += "libtclap \
libtclap-devel \
pkgconfig-tclap \
tclap"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
