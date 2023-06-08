SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze style, color-scheme and aditional assets."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "breeze5-style-5.27.4-2.1.aarch64.rpm"
RPM_HASH = "cc5fb26fe48b4e5cb04e727eb97c960b07ffbbd5ba617d47298cd74d1e0dfbe7352c0d892ddb82b0bce993a742a3ebab4af5748d96716f892e63594eab51ce48"

RPROVIDES:${PN} += "application() application(breezestyleconfig.desktop) breeze5-style breeze5-style(aarch-64) cmake(Breeze)"
RDEPENDS:${PN} += "kconf_update5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5Kirigami2.so.5()(64bit) libKF5Style.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libbreezecommon5.so.5()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
