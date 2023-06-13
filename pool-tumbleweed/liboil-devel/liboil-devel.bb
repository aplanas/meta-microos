SUMMARY = "Headers for the library of Optimized Inner Loops"
DESCRIPTION = "Liboil is a library of functions that are optimized for various \
CPUs."
LICENSE = "BSD-2-Clause"

PV = "0.3.17"

RPM_NAME = "liboil-devel-0.3.17-26.7.aarch64.rpm"
RPM_HASH = "a7141400ceb61e8556f58bf428b88e17cda193d02d147b00aea7e3c21edbf3e3320dc543208b483e92339d75276e0d8fe7a92f43336166d081e49de7e754afad"

RPROVIDES:${PN} += "liboil-devel \
liboil-devel(aarch-64) \
pkgconfig(liboil-0.3)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libc.so.6()(64bit) \
liboil-0.3.so.0()(64bit) \
liboil-0_3-0"

inherit rpm
