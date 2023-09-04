SUMMARY = "Network transparent access to files and data"
DESCRIPTION = "This framework implements almost all the file management functions you \
will ever need. In fact, the KDE file manager (Dolphin) and the KDE \
file dialog also uses this to provide its network-enabled file management. \
KIO core libraries, ioslave and daemons."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kio-core-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "3818c93cbe91446763741e09128d7f1f5251b8730e461877b59bca833a72a9a39a81cb13a0750c518800c21c1eeb563646eed92e6a06a5fc602aeda563079acd"

RPROVIDES:${PN} += "kio-core \
libKF5KIOCore.so.5 \
libKF5KIONTLM.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5AuthCore.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5DocTools.so.5 \
libKF5I18n.so.5 \
libKF5KIOGui.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libacl.so.1 \
libc.so.6 \
libexslt.so.0 \
libgssapi-krb5.so.2 \
libmount.so.1 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
