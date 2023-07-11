SUMMARY = "Remote Desktop Connection"
DESCRIPTION = "Krdc allows to connect to VNC and RDP compatible servers."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "krdc-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2700786da6a3f41ad7b744e36eee5f2678d0fffeacc589f34b929446e16f98f8c1d8abfea133a78adeced72b631e67cfa3ab2169ca7d2677cca68376b30f219d"

RPROVIDES:${PN} += "krdc \
libkcm-krdc-rdpplugin.so \
libkcm-krdc-vncplugin.so \
libkrdc-rdpplugin.so \
libkrdc-testplugin.so \
libkrdc-vncplugin.so \
libkrdccore.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
breeze5-icons \
freerdp \
ld-linux-aarch64.so.1 \
libKF5Bookmarks.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DNSSD.so.5 \
libKF5I18n.so.5 \
libKF5KCMUtils.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libssh.so.4 \
libstdc++.so.6 \
libvncclient.so.1"

inherit rpm
