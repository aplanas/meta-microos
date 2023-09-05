SUMMARY = "Remote Desktop Connection"
DESCRIPTION = "Krdc allows to connect to VNC and RDP compatible servers."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "krdc-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "e09ccb0d1bcc46697425d59ef7e48ed0344166ac4fc756797f4cc150b23ed3f7a1859ee771ba6553554024161ca8a1ea19c2b8468eddea519f391a8afc16ab86"

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
