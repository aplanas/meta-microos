SUMMARY = "Development files for libopenshot"
DESCRIPTION = "A library for video editing, composition, animation, and playback, \
which focuses on The library is written in C++. \
 \
This package contains header files and libraries needed to develop \
application that use libopenshot."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.2"

RPM_NAME = "libopenshot-devel-0.3.2-1.1.aarch64.rpm"
RPM_HASH = "f637aba10cf0c39506c2dc00b007ae38976eb2d462d34cfc486ce8d143485aea7d1507cd9e2871d9851714273d0519268c0f5f5c1a6b9d6b2d1e5eba800fee73"

RPROVIDES:${PN} += "libopenshot-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libopenshot-audio.so.9 \
libopenshot.so.25 \
libopenshot25 \
libruby3.2.so.3.2 \
libstdc++.so.6"

inherit rpm
