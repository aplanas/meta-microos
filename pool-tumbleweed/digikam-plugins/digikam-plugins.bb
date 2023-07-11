SUMMARY = "DigiKam plugins"
DESCRIPTION = "Additional plugins for digiKam."
LICENSE = "GPL-2.0-or-later"

PV = "8.0.0"

RPM_NAME = "digikam-plugins-8.0.0-4.1.aarch64.rpm"
RPM_HASH = "5ad99c8303028244b8f513f44aff42d8decdbeb70ee0b261be7ff743164f6a72379cf4a6416f3279d10d2b9f6ad4848e7ffa51eb5d1fd5734dc6e62f63a6a709"

RPROVIDES:${PN} += "digikam-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Sane.so.5 \
libKF5ThreadWeaver.so.5 \
libKF5XmlGui.so.5 \
libMagick++-7.Q16HDRI.so.5 \
libMagickCore-7.Q16HDRI.so.10 \
libOpenGL.so.0 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5NetworkAuth.so.5 \
libQt5PrintSupport.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libc.so.6 \
libdigikamcore.so.8.0.0 \
libdigikamdatabase.so.8.0.0 \
libdigikamgui.so.8.0.0 \
libexslt.so.0 \
libgcc-s.so.1 \
libheif.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
