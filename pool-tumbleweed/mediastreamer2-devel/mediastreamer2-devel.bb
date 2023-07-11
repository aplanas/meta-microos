SUMMARY = "Headers and libraries for the mediastreamer2 library"
DESCRIPTION = "Mediastreamer2 is a library to make audio and video real-time \
streaming and processing. It is written in pure C and based upon the \
oRTP library. \
 \
This package contains header files and development libraries needed to \
develop programs using the mediastreamer2 library."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.73"

RPM_NAME = "mediastreamer2-devel-5.2.73-1.1.aarch64.rpm"
RPM_HASH = "33d32497215b5af00211237edd2478cf82f1ace0bc6aa5f46869413d176f8f5570a9963a2a5242b7f5a4b094aa31fab6903430795d129de96da3997eb8737540"

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
