SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libkwalletbackend5-5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "b0e98622aaec509d0ac44cab8f36f21fd7f0c588b614f23210822b53320438a04518f17499953a58d284ae043a55a50a236e7230af59008fe9220903e25c8e44"

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
