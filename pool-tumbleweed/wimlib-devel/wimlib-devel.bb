SUMMARY = "Development files for wimlib"
DESCRIPTION = "Development files for wimlib"
LICENSE = "CC0-1.0 & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "1.13.6"

RPM_NAME = "wimlib-devel-1.13.6-1.4.aarch64.rpm"
RPM_HASH = "03e21ebcfc6119fad83386ac29afeca7a86912762858e27bcf275fb7728b7c2df8dba2d09373574e044a666afd9e6daceddca86b13484998ae72a0ef1154ca41"

RPROVIDES:${PN} += "pkgconfig-wimlib \
wimlib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwim15 \
pkgconfig-fuse \
pkgconfig-libcrypto \
pkgconfig-libntfs-3g \
pkgconfig-libxml-2.0"

inherit rpm
