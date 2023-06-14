SUMMARY = "Header files for libite"
DESCRIPTION = "Development and header files for libite."
LICENSE = "MIT & X11"

PV = "2.5.3"

RPM_NAME = "libite-devel-2.5.3-1.1.aarch64.rpm"
RPM_HASH = "687ed8275a16268efe77d9d99a0c6393c7e8cab7ca18aa53911bc5fae66d4cae641254fdc8c95e84cd7721f4281d4e30fac0949b806b2448c70a6feab679a623"

RPROVIDES:${PN} += "libite-devel \
pkgconfig-libite"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libite5"

inherit rpm
