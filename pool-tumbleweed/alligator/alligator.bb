SUMMARY = "Convergent RSS/Atom feed reader"
DESCRIPTION = "Alligator is a convergent RSS/Atom feed reader."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "alligator-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "06316ca986318d31c2c0821ea8bacf37bf29e9c665e57a60893361ea7cbe19ef590e5c1b87c955e628240e57557cdff92ae7a8ca8a8f8ce813be08f49cab93ce"

RPROVIDES:${PN} += "alligator"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Syndication.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5QuickControls2.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
