SUMMARY = "Development files for LAL Frame"
DESCRIPTION = "This package contains sources and header files needed to build applications \
that use the LAL Frame library."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "lalframe-devel-2.0.1-1.2.aarch64.rpm"
RPM_HASH = "664a22cd716c14e0d70af68f756ef32bfe0805fbd9a6eda3f409ee12853198341a72860668cc86ff70da8c3cec30eab1fbdd67fc09b0559589d7762fe0625db1"

RPROVIDES:${PN} += "config-lalframe-devel \
lalframe-devel \
pkgconfig-lalframe"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalframe.so.13 \
liblalframe13 \
liblalsupport.so.14 \
libm.so.6 \
pkgconfig-framecppc \
pkgconfig-framel \
pkgconfig-lal"

inherit rpm
