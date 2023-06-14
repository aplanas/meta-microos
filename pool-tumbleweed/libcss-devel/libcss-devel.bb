SUMMARY = "Development files for libcss"
DESCRIPTION = "The libcss-devel package contains libraries and header files for \
developing applications that use libcss."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "libcss-devel-0.9.1-2.9.aarch64.rpm"
RPM_HASH = "90a65dc3932e7cbea780612cc16e1909531cd351522d22f74e511368673849cbd874532254b33a779ac3c7f5b3a0b99067c166313c18b73635f37316ee3138be"

RPROVIDES:${PN} += "libcss-devel \
pkgconfig-libcss"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcss0 \
pkgconfig-libparserutils \
pkgconfig-libwapcaplet"

inherit rpm
