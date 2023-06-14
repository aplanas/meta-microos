SUMMARY = "fwupd Backend for Discover"
DESCRIPTION = "A plugin for Discover to support updates of system firmware using fwupd."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "discover-backend-fwupd-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "fa8f365a66544268018552bc3321ef89815ef8efec11a010b75e0bc8526b883827f92aeb1bc76a15caa211794443055ddb79d48d83286269fba3c16ca00babf5"

RPROVIDES:${PN} += "discover-backend-fwupd"

RDEPENDS:${PN} += "discover \
ld-linux-aarch64.so.1 \
libDiscoverCommon.so \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libfwupd.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
