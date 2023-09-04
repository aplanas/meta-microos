SUMMARY = "Header files for kcompletion, a widget collection with completion support"
DESCRIPTION = "Development files for KCompletion, a widget collection with advanced \
completion support as well as a lower-level completion class which \
can be used with own widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kcompletion-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "2bd79090e982f8e4897361941da4a98d953049d8fec0a6f3057f4085d77ea3e802e65a254be758cf1c1833d549560c8df648eb629f3913a1af3de205b6d4f234"

RPROVIDES:${PN} += "cmake-KF5Completion \
kcompletion-devel"

RDEPENDS:${PN} += "cmake-Qt5Widgets \
extra-cmake-modules \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5Completion5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
