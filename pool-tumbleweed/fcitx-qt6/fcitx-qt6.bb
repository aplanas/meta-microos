SUMMARY = "Qt6 IM module for Fcitx"
DESCRIPTION = "Qt6 IM module for Fcitx."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "fcitx-qt6-1.2.7-1.25.aarch64.rpm"
RPM_HASH = "b5d27caf435f081b0fa2f3f985dc333d3f858dfe0740758342c32888b3260e384271c18506a5dccd03aa388dba4878de352dd1aa54e7902c7d7a62d08b82ad62"

RPROVIDES:${PN} += "fcitx-qt6 \
fcitx-qt6(aarch-64) \
libfcitxplatforminputcontextplugin-qt6.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6DBus.so.6()(64bit) \
libQt6DBus.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxkbcommon.so.0()(64bit)"

inherit rpm
