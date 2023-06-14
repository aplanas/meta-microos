SUMMARY = "A simple open-source disk benchmark tool for Linux distros"
DESCRIPTION = "KDiskMark is an HDD and SSD benchmark tool with a very friendly graphical user interface."
LICENSE = "GPL-3.0-only"

PV = "3.1.3"

RPM_NAME = "kdiskmark-3.1.3-1.1.aarch64.rpm"
RPM_HASH = "3cc637469623b26610143146ec0fc01d6a4f7eaa2dabfea64754f2da8becfc8c81866239ebb4459d04936241c0e44358cb86a4aa257dac6240485332e715f3c2"

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
