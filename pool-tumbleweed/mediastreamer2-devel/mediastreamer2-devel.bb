SUMMARY = "Headers and libraries for the mediastreamer2 library"
DESCRIPTION = "Mediastreamer2 is a library to make audio and video real-time \
streaming and processing. It is written in pure C and based upon the \
oRTP library. \
 \
This package contains header files and development libraries needed to \
develop programs using the mediastreamer2 library."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "mediastreamer2-devel-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "f07f2c989322ab3044c3b717a8925ba37a52d6df69e5e9f724782ae2728545a9456e04da88652aeb583c72f26440d9d08fe89643cd0813bd7887c81302d1d2c6"

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
