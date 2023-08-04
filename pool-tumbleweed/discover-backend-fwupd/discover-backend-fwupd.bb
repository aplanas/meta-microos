SUMMARY = "fwupd Backend for Discover"
DESCRIPTION = "A plugin for Discover to support updates of system firmware using fwupd."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.7"

RPM_NAME = "discover-backend-fwupd-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "9495cda3a481c2cb732f348f5b0ef306e861db766b0d2421a0c9e881828965078fb39d882ca7ed546c8eb156fc7ad434cfb4a5b8e82105e04ec4990cf319310e"

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
