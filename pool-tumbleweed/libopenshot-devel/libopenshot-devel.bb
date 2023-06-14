SUMMARY = "Development files for libopenshot"
DESCRIPTION = "A library for video editing, composition, animation, and playback, \
which focuses on The library is written in C++. \
 \
This package contains header files and libraries needed to develop \
application that use libopenshot."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "libopenshot-devel-0.3.1-1.1.aarch64.rpm"
RPM_HASH = "5a871f98d32e81836c25bd8e81e7d7c9a67351b7cd04c227b2eda3ef93cd7e91ea592b796104c6a85051cd9da46e603f34114fe82e645368f5ab38cbd26821ff"

RPROVIDES:${PN} += "libopenshot-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libopenshot-audio.so.9 \
libopenshot.so.24 \
libopenshot24 \
libruby3.2.so.3.2 \
libstdc++.so.6"

inherit rpm
