SUMMARY = "Remote Desktop Connection"
DESCRIPTION = "Krdc allows to connect to VNC and RDP compatible servers."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "krdc-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "01e850269a24cc597c9d5ba3d2f21a272da999954893ac44737280304271f4b5c8c58bdc1c5989330e9620fe615966d6d55e14a6a7452ce1e9f36fd748d396ee"

RPROVIDES:${PN} += "application() \
application(org.kde.krdc.desktop) \
krdc \
krdc(aarch-64) \
libkcm_krdc_rdpplugin.so()(64bit) \
libkcm_krdc_vncplugin.so()(64bit) \
libkrdc_rdpplugin.so()(64bit) \
libkrdc_testplugin.so()(64bit) \
libkrdc_vncplugin.so()(64bit) \
libkrdccore.so.5()(64bit) \
metainfo() \
metainfo(org.kde.krdc.appdata.xml) \
mimehandler(x-scheme-handler/rdp) \
mimehandler(x-scheme-handler/vnc)"

RDEPENDS:${PN} += "/sbin/ldconfig \
breeze5-icons \
freerdp \
ld-linux-aarch64.so.1()(64bit) \
libKF5Bookmarks.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DNSSD.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5Wallet.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libssh.so.4()(64bit) \
libssh.so.4(LIBSSH_4_5_0)(64bit) \
libstdc++.so.6()(64bit) \
libvncclient.so.1()(64bit)"

inherit rpm
