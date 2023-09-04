SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libkwalletbackend5-5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "2d31ee227d3b5b23627de3c8f77418d30ae761370a46f1da207bec7ce0188d10514d120bdcf76bd860f3f71af4e8678fcc61ca16ee0d1b846b9af417da919597"

RPROVIDES:${PN} += "libkwalletbackend5-5 \
libkwalletbackend5.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libgcrypt.so.20 \
libgpgmepp.so.6 \
libstdc++.so.6"

inherit rpm
