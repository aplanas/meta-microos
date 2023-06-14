SUMMARY = "Headers and libraries for the mediastreamer2 library"
DESCRIPTION = "Mediastreamer2 is a library to make audio and video real-time \
streaming and processing. It is written in pure C and based upon the \
oRTP library. \
 \
This package contains header files and development libraries needed to \
develop programs using the mediastreamer2 library."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "mediastreamer2-devel-5.2.49-1.2.aarch64.rpm"
RPM_HASH = "5bd8b04644158b30c0d66df7ca912016e0276022f4b11ca278b2b3855f6ba522f78fd7e148ba43dd480a742e1bfe933598f4f182089366e1b47762d18f5d5097"

RPROVIDES:${PN} += "mediastreamer2-devel \
pkgconfig-mediastreamer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
bcmatroska2-devel \
ld-linux-aarch64.so.1 \
libbctoolbox-tester.so.1 \
libbctoolbox.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmediastreamer.so.11 \
libmediastreamer11 \
libortp.so.15 \
libstdc++.so.6 \
mediastreamer2 \
pkgconfig-bctoolbox \
pkgconfig-ortp"

inherit rpm
