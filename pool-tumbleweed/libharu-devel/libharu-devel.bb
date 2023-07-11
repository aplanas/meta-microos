SUMMARY = "Development files for libharu"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use libharu."
LICENSE = "Zlib"

PV = "2.4.3"

RPM_NAME = "libharu-devel-2.4.3-1.1.aarch64.rpm"
RPM_HASH = "d872f2e759ef2074e94e93e72426c74e75fa3ce3545a4068a3ffa59876f565b3de4b60f6a09cc823e59364ce523b8ec96902539bbda9bcc9d62b4e92eafb0ec0"

RPROVIDES:${PN} += "libharu-devel"

RDEPENDS:${PN} += "libhpdf2 \
libpng-devel \
zlib-devel"

inherit rpm
