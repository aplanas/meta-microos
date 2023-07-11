SUMMARY = "Libraries and Base Files for the Calligra Suite"
DESCRIPTION = "The Calligra Suite is a set of applications that allows you to easily complete \
your work. The Calligra Suite is unique because not only does it consist of the \
normal office applications like word processor (Words) and spreadsheet (Sheets), \
but it brings you creative applications as well. \
 \
This package contains the base files and libraries for the Suite."
LICENSE = "GFDL-1.2-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-3.2.1-7.19.aarch64.rpm"
RPM_HASH = "3da25b261ee0e820b74a16000b4161acb9ca732231911cf004cae5073aeab2492ca98461edc8ecb93e5270638025d5853650fd142f09db52acdd04a970e16238"

RPROVIDES:${PN} += "calligra \
libCalligraComponentsPlugin.so \
libbasicflakes.so.17 \
libflake.so.17 \
libkoformula.so.17 \
libkokross.so.17 \
libkomain.so.17 \
libkomsooxml.so.17 \
libkoodf.so.17 \
libkoodf2.so.17 \
libkoodfreader.so.17 \
libkopageapp.so.17 \
libkoplugin.so.17 \
libkostore.so.17 \
libkotext.so.17 \
libkotextlayout.so.17 \
libkovectorimage.so.17 \
libkoversion.so.17 \
libkowidgets.so.17 \
libkowidgetutils.so.17 \
libkundo2.so.17 \
libpigmentcms.so.17 \
qt5qmlimport-org.kde.calligra.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
kcoreaddons \
ld-linux-aarch64.so.1 \
libKChart.so.2 \
libKF5Activities.so.5 \
libKF5Archive.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5KrossCore.so.5 \
libKF5KrossUi.so.5 \
libKF5Notifications.so.5 \
libKF5Service.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libcalligrasheetscommon.so.17 \
libcalligrasheetsodf.so.17 \
libcalligrastageprivate.so.17 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
liblcms2.so.2 \
libm.so.6 \
libodfgen-0.1.so.1 \
libphonon4qt5.so.4 \
libphonon4qt5experimental.so.4 \
libqca-qt5.so.2 \
librevenge-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libspnav.so.0 \
libstdc++.so.6 \
libvisio-0.1.so.1 \
libwordsprivate.so.17 \
libwpg-0.3.so.3"

inherit rpm
