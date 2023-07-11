SUMMARY = "RSS Feed Reader"
DESCRIPTION = "Akregator is a news feed reader. It enables you to follow news sites, \
blogs and other RSS/Atom-enabled websites without the need to \
manually check for updates using a web browser. Akregator is designed \
for convenient reading of hundreds of news sources. It comes with \
Konqueror integration for adding news feeds and with an internal \
browser for news reading."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "akregator-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "8407c2eb1a814cea7ce4f6acb08d4afeaf3d7124f3f089e76f93447796ffdd715965385afd649d6619bd7278ac4893bd7a2a7eda8c7343d6c9b7b2418baa3590"

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
