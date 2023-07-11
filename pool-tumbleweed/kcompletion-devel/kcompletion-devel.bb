SUMMARY = "Header files for kcompletion, a widget collection with completion support"
DESCRIPTION = "Development files for KCompletion, a widget collection with advanced \
completion support as well as a lower-level completion class which \
can be used with own widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kcompletion-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "be704b288bbde30f40ac735bac58cfc851192fe7d2d59aedc8f0adaf442b6f2a56b3959336b65ae1d6c9899bf44788e0c7b35a329feaebf4c110f175ba9ffbee"

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
