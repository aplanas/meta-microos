SUMMARY = "DigiKam plugins"
DESCRIPTION = "Additional plugins for digiKam."
LICENSE = "GPL-2.0-or-later"

PV = "8.0.0"

RPM_NAME = "digikam-plugins-8.0.0-3.2.aarch64.rpm"
RPM_HASH = "a3cec967ba99ce74989d0dfaec5a55e88900556504f316695f9cada113ad57d7a70ae794927bd1c9a3ff251d2f66e5848ca3be247b9e3bd977b608213166ebf4"

RPROVIDES:${PN} += "digikam-plugins \
digikam-plugins(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Sane.so.5()(64bit) \
libKF5ThreadWeaver.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libMagick++-7.Q16HDRI.so.5()(64bit) \
libMagickCore-7.Q16HDRI.so.10()(64bit) \
libOpenGL.so.0()(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5NetworkAuth.so.5()(64bit) \
libQt5NetworkAuth.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libQt5XmlPatterns.so.5()(64bit) \
libQt5XmlPatterns.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libdigikamcore.so.8.0.0()(64bit) \
libdigikamdatabase.so.8.0.0()(64bit) \
libdigikamgui.so.8.0.0()(64bit) \
libexslt.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libheif.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit)"

inherit rpm
