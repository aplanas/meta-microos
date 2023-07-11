SUMMARY = "Development files for libopenshot-audio"
DESCRIPTION = "The OpenShot Audio Library. \
 \
This package contains header files and libraries needed to develop \
application that use libopenshot-audio."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "libopenshot-audio-devel-0.3.1-1.2.aarch64.rpm"
RPM_HASH = "09b19651ee244664b7b136464f488e412363c0b7afd3acd8c7de036797e40e2b73ba5fb587d2d2ac124c9a1c1ceb15b35c9b3d0bc06af361cb36ae394d64612b"

RPROVIDES:${PN} += "cmake-OpenShotAudio \
libopenshot-audio-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenshot-audio.so.9 \
libopenshot-audio9 \
libstdc++.so.6"

inherit rpm
