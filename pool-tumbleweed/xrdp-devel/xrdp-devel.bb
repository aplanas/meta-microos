SUMMARY = "Development files for xrdp"
DESCRIPTION = "This package contains the development headers for xrdp."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.9.20"

RPM_NAME = "xrdp-devel-0.9.20-8.1.aarch64.rpm"
RPM_HASH = "088cdfe3817aa3c5018aab80ef6031bde5348fd4facb27fc51b85e907c5b8fa02ee8760494c32b70f05dda372a65a91860f8c797c0e20e7ecc50d8fb7d4362cc"

RPROVIDES:${PN} += "pkgconfig-libpainter \
pkgconfig-rfxcodec \
pkgconfig-xrdp \
xrdp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpainter0 \
librfxencode0"

inherit rpm
