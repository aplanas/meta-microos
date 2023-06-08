SUMMARY = "Flatpak Backend for Discover"
DESCRIPTION = "A plugin for Discover to support installation and management of Flatpak \
applications and repositories."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.4"

RPM_NAME = "discover-backend-flatpak-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "d721d21c67cf964c7fec6e007ab5c82bc229385fd77a7109a747821f7506c96743ac7e891a3375e53ee3231a8637e14ca48a7fa4e086ae4fa069aaf37cee5667"

RPROVIDES:${PN} += "application() application(org.kde.discover-flatpak.desktop) discover-backend-flatpak discover-backend-flatpak(aarch-64) metainfo() metainfo(org.kde.discover.flatpak.appdata.xml) mimehandler(application/vnd.flatpak) mimehandler(application/vnd.flatpak.ref) mimehandler(application/vnd.flatpak.repo)"
RDEPENDS:${PN} += "discover flatpak ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libAppStreamQt.so.2()(64bit) libDiscoverCommon.so()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5Service.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libflatpak.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
