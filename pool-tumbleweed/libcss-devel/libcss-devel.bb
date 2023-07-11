SUMMARY = "Development files for libcss"
DESCRIPTION = "The libcss-devel package contains libraries and header files for \
developing applications that use libcss."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "libcss-devel-0.9.1-2.10.aarch64.rpm"
RPM_HASH = "0cf496a49597864841833540ad61fbe5de02173fbeea8e8b6f36a0df105d33fa9f3e37c23d47ad1dc81de41cc40eca17871903b502e17c26f3ff09c27135c027"

RPROVIDES:${PN} += "libcss-devel \
pkgconfig-libcss"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcss0 \
pkgconfig-libparserutils \
pkgconfig-libwapcaplet"

inherit rpm
