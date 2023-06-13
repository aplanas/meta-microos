SUMMARY = "WPA supplicant graphical front-end"
DESCRIPTION = "This package contains a graphical front-end to wpa_supplicant, an \
implementation of the WPA Supplicant component."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "wpa_supplicant-gui-2.10-5.1.aarch64.rpm"
RPM_HASH = "01dd12ed1e58ae2c3e57727c29847a9a0c83951f42a9ee8f3ec7cde9cc25d93fb13a9ee9f15fd98ac872bfaa807a88f10adbebe651e70d529d1cf84186d9e5c3"

RPROVIDES:${PN} += "wpa_supplicant-gui \
wpa_supplicant-gui(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
wpa_supplicant"

inherit rpm
