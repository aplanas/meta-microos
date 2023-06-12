SUMMARY = "fwupd Backend for Discover"
DESCRIPTION = "A plugin for Discover to support updates of system firmware using fwupd."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "discover-backend-fwupd-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "fa8f365a66544268018552bc3321ef89815ef8efec11a010b75e0bc8526b883827f92aeb1bc76a15caa211794443055ddb79d48d83286269fba3c16ca00babf5"

RPROVIDES:${PN} += "discover-backend-fwupd discover-backend-fwupd(aarch-64)"
RDEPENDS:${PN} += "discover ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libDiscoverCommon.so()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfwupd.so.2()(64bit) libfwupd.so.2(LIBFWUPD_0.1.1)(64bit) libfwupd.so.2(LIBFWUPD_0.7.0)(64bit) libfwupd.so.2(LIBFWUPD_0.7.1)(64bit) libfwupd.so.2(LIBFWUPD_0.7.3)(64bit) libfwupd.so.2(LIBFWUPD_0.9.2)(64bit) libfwupd.so.2(LIBFWUPD_0.9.3)(64bit) libfwupd.so.2(LIBFWUPD_0.9.4)(64bit) libfwupd.so.2(LIBFWUPD_0.9.6)(64bit) libfwupd.so.2(LIBFWUPD_0.9.8)(64bit) libfwupd.so.2(LIBFWUPD_1.0.0)(64bit) libfwupd.so.2(LIBFWUPD_1.0.7)(64bit) libfwupd.so.2(LIBFWUPD_1.2.6)(64bit) libfwupd.so.2(LIBFWUPD_1.4.5)(64bit) libfwupd.so.2(LIBFWUPD_1.5.0)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
