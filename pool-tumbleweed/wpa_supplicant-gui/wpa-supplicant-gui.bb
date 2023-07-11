SUMMARY = "WPA supplicant graphical front-end"
DESCRIPTION = "This package contains a graphical front-end to wpa_supplicant, an \
implementation of the WPA Supplicant component."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "wpa_supplicant-gui-2.10-5.2.aarch64.rpm"
RPM_HASH = "4095f610cba0cb9ef11c5d55c1eec1f1147b67f0478a2ee063f59569bc92d8e114733a17a2048107d60923c994d65051f2a78185a015ec091908c02a7569b9ea"

RPROVIDES:${PN} += "wpa-supplicant-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
wpa-supplicant"

inherit rpm
