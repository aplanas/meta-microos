SUMMARY = "Network transparent access to files and data"
DESCRIPTION = "This framework implements almost all the file management functions you \
will ever need. In fact, the KDE file manager (Dolphin) and the KDE \
file dialog also uses this to provide its network-enabled file management. \
KIO core libraries, ioslave and daemons."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kio-core-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "fad92b1cefcec1c04a93a0f7311a3e7ab519ceadcab065879387b47f1b202a018c78cf0f231510997c66f52e38ec91c23984a4f0aa8fbf22016d2589cd0f421a"

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
