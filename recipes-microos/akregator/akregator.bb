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

RPROVIDES:${PN} += "akregator akregator(aarch-64) akregator5 application() application(org.kde.akregator.desktop) libakregatorinterfaces.so.5()(64bit) libakregatorprivate.so.5()(64bit) metainfo() metainfo(org.kde.akregator.appdata.xml) mimehandler(application/atom+xml) mimehandler(application/rdf+xml) mimehandler(application/rss+xml)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Codecs.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5NotifyConfig.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5PimCommon.so.5()(64bit) libKF5Syndication.so.5()(64bit) libKF5TextEditTextToSpeech.so.1()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKPim5GrantleeTheme.so.5()(64bit) libKPim5KontactInterface.so.5()(64bit) libKPim5Libkdepim.so.5()(64bit) libKPim5MessageViewer.so.5()(64bit) libKPim5MimeTreeParser.so.5()(64bit) libKPim5TextEdit.so.5()(64bit) libKPim5WebEngineViewer.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
