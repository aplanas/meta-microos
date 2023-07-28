SUMMARY = "Include files and libraries for libkdumpfile development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libkdumpfile."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libkdumpfile-devel-0.5.2-1.1.aarch64.rpm"
RPM_HASH = "e3d8e21e40597e0aa47816806bf79d2f3051886c4ab3b846c14f1328d5e87171569a85c40078360d389387c193c8c5740206b2338f7c0f5fbf494a91e508aa2d"

RPROVIDES:${PN} += "libkdumpfile-devel \
pkgconfig-libkdumpfile"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libkdumpfile10 \
pkgconfig-libaddrxlat \
pkgconfig-libzstd \
pkgconfig-lzo2 \
pkgconfig-snappy \
pkgconfig-zlib"

inherit rpm
