SUMMARY = "A mindmapping-like tool"
DESCRIPTION = "Semantik (previously Kdissert) is a mindmapping-like tool to help students \
to produce complicated documents very quickly and efficiently : \
presentations, dissertations, thesis, reports. \
 \
While targetted mostly at students, Semantik can also help teachers, \
decision maker, engineers and businessmen. \
 \
Though this application shares some similarities with general-purpose \
mindmapping tools like Freemind or Vym, the very first goal of Semantik is \
to create general-purpose documents through the use of mindmaps."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "1.2.9"

RPM_NAME = "semantik-1.2.9-1.1.aarch64.rpm"
RPM_HASH = "99d7141de4a3ab0bd9672ba02ef038240987eb1481b9f96b3e59be61d88c73143e28c736b5277d6c792aebf097a98da9e0a6a1cc00de41bb99df7ac700a50a8b"

RPROVIDES:${PN} += "libsemantik.so.1 \
semantik"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDELibs4Support.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5SonnetUi.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.10.so.1.0 \
libstdc++.so.6"

inherit rpm
