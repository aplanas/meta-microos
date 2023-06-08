SUMMARY = "RSS Feed Reader"
DESCRIPTION = "Akregator is a news feed reader. It enables you to follow news sites, \
blogs and other RSS/Atom-enabled websites without the need to \
manually check for updates using a web browser. Akregator is designed \
for convenient reading of hundreds of news sources. It comes with \
Konqueror integration for adding news feeds and with an internal \
browser for news reading."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "akregator-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "df3dc9285d6c3aa67a7ef32a1c004a8fefaebe02519689bedf6f7ba6fe52af91245610030fb35b1c6287beb2115fcb27baf4dc3c592772e86f03bc90ee2db33a"

RPROVIDES:${PN} += "akregator akregator(aarch-64) akregator5 application() application(org.kde.akregator.desktop) libakregatorinterfaces.so.5()(64bit) libakregatorprivate.so.5()(64bit) metainfo() metainfo(org.kde.akregator.appdata.xml) mimehandler(application/atom+xml) mimehandler(application/rdf+xml) mimehandler(application/rss+xml)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Codecs.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5NotifyConfig.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5PimCommon.so.5()(64bit) libKF5Syndication.so.5()(64bit) libKF5TextEditTextToSpeech.so.1()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKPim5GrantleeTheme.so.5()(64bit) libKPim5KontactInterface.so.5()(64bit) libKPim5Libkdepim.so.5()(64bit) libKPim5MessageViewer.so.5()(64bit) libKPim5MimeTreeParser.so.5()(64bit) libKPim5TextEdit.so.5()(64bit) libKPim5WebEngineViewer.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
