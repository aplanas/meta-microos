SUMMARY = "Header files for kcompletion, a widget collection with completion support"
DESCRIPTION = "Development files for KCompletion, a widget collection with advanced \
completion support as well as a lower-level completion class which \
can be used with own widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kcompletion-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "a36d1dbe0fc98d8fbe715f9b0fc313ddda2ca333099a32f698603f98fd5e92a7be99683e35bd98bc17e1917c175cdc92a925a6256daf6bd812f9542abb469c55"

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
