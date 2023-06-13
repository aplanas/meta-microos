SUMMARY = "fwupd Backend for Discover"
DESCRIPTION = "A plugin for Discover to support updates of system firmware using fwupd."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "discover-backend-fwupd-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "fa8f365a66544268018552bc3321ef89815ef8efec11a010b75e0bc8526b883827f92aeb1bc76a15caa211794443055ddb79d48d83286269fba3c16ca00babf5"

RPROVIDES:${PN} += "discover-backend-fwupd \
discover-backend-fwupd(aarch-64)"

RDEPENDS:${PN} += "discover \
ld-linux-aarch64.so.1()(64bit) \
libDiscoverCommon.so()(64bit) \
libKF5I18n.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libfwupd.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
