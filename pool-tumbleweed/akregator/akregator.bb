SUMMARY = "RSS Feed Reader"
DESCRIPTION = "Akregator is a news feed reader. It enables you to follow news sites, \
blogs and other RSS/Atom-enabled websites without the need to \
manually check for updates using a web browser. Akregator is designed \
for convenient reading of hundreds of news sources. It comes with \
Konqueror integration for adding news feeds and with an internal \
browser for news reading."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "akregator-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "fa47c873e17a5e020f9ea9092f7e1a73205b3a2159ea3fd33eadc11f0aa2bb07ae4c6dfde8d927c428a9d262b49df812037847a01490e7fd3387bd71e264f5e3"

RPROVIDES:${PN} += "akregator \
akregator5 \
libakregatorinterfaces.so.5 \
libakregatorprivate.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Parts.so.5 \
libKF5PimCommon.so.5 \
libKF5Syndication.so.5 \
libKF5TextEditTextToSpeech.so.1 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5GrantleeTheme.so.5 \
libKPim5KontactInterface.so.5 \
libKPim5Libkdepim.so.5 \
libKPim5MessageViewer.so.5 \
libKPim5MimeTreeParser.so.5 \
libKPim5TextEdit.so.5 \
libKPim5WebEngineViewer.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
