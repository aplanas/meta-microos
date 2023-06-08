SUMMARY = "Framework for searching and managing metadata"
DESCRIPTION = "Baloo is a framework for searching and managing metada"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "baloo5-widgets-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "2d5f29343dcd4b6ccb6c12ee0ba6787beb829bdb385b08dcf0b82917c15a67ec2bf62edaf8b2ba2db9449f8ea629741956e47d7880e086f9838c5c461f36b094"

RPROVIDES:${PN} += "baloo5-widgets baloo5-widgets(aarch-64) libKF5BalooNaturalQueryParser1 libKF5BalooWidgets.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Baloo.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5FileMetaData.so.3()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
