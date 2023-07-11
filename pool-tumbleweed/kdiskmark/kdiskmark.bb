SUMMARY = "A simple open-source disk benchmark tool for Linux distros"
DESCRIPTION = "KDiskMark is an HDD and SSD benchmark tool with a very friendly graphical user interface."
LICENSE = "GPL-3.0-only"

PV = "3.1.4"

RPM_NAME = "kdiskmark-3.1.4-1.1.aarch64.rpm"
RPM_HASH = "52fc0f0ec35544510859dac4036bb90ffebdd6be3d678acec9cf8a596c58bf604827f0b957c81976a73fc0869b49839a3de8403be3b5c488e865b76be8f001c6"

RPROVIDES:${PN} += "bundled-singleapplication \
kdiskmark"

RDEPENDS:${PN} += "fio \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpolkit-qt5-core-1.so.1 \
libstdc++.so.6"

inherit rpm
