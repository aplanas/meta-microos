SUMMARY = "Adwaita Qt6 theme"
DESCRIPTION = " \
 \
 \
 \
Adwaita theme variant for applications utilizing Qt6"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "adwaita-qt6-1.4.2-3.3.aarch64.rpm"
RPM_HASH = "7859422d16864cf84c45dae4ab00b6aa6ac5d9d9c0d70b52ed1d0cb2e2af4df10cbc25cfdcd526fe38924b4f9dea538cbb035feb20f0ef32d628c903c7f87ff5"

RPROVIDES:${PN} += "adwaita-qt6 \
adwaita-qt6(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libadwaitaqt6-1 \
libadwaitaqt6.so.1()(64bit) \
libadwaitaqt6priv.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
