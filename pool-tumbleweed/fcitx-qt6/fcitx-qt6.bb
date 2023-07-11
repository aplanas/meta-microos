SUMMARY = "Qt6 IM module for Fcitx"
DESCRIPTION = "Qt6 IM module for Fcitx."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "fcitx-qt6-1.2.7-1.26.aarch64.rpm"
RPM_HASH = "ceafb98c21daa0cd11c7e03951f9f623a1a647590c246e18724fe77bf943e76a91dc9849c21a7a16ab5ae2ef1e8254c2c4113b06de87c1cf213a2fcda73fca6b"

RPROVIDES:${PN} += "fcitx-qt6 \
libfcitxplatforminputcontextplugin-qt6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
