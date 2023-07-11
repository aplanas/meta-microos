SUMMARY = "Network transparent access to files and data"
DESCRIPTION = "This framework implements almost all the file management functions you \
will ever need. In fact, the KDE file manager (Dolphin) and the KDE \
file dialog also uses this to provide its network-enabled file management. \
KIO core libraries, ioslave and daemons."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kio-core-5.107.0-2.1.aarch64.rpm"
RPM_HASH = "0e91f6609c4cbadc746a6fb746a59550e49a706626f82be79be312f181734d9f30f49c215a474b385a3cc72d1d6be9ac0db92cf0b24f6b2719c62a6ef77721f4"

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
