SUMMARY = "Libraries and Base Files for the Calligra Suite"
DESCRIPTION = "The Calligra Suite is a set of applications that allows you to easily complete \
your work. The Calligra Suite is unique because not only does it consist of the \
normal office applications like word processor (Words) and spreadsheet (Sheets), \
but it brings you creative applications as well. \
 \
This package contains the base files and libraries for the Suite."
LICENSE = "GFDL-1.2-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-3.2.1-7.17.aarch64.rpm"
RPM_HASH = "c91f2307186ac3cda906c60cc4aecac8da1f116bc41403d99d7f86f4e14c849b6cf1fdcd8a83412e66ef5e66215f0e1ac42bc65473336dc6e42cbed2624bc119"

RPROVIDES:${PN} += "application() \
application(calligra.desktop) \
calligra \
calligra(aarch-64) \
libCalligraComponentsPlugin.so()(64bit) \
libbasicflakes.so.17()(64bit) \
libflake.so.17()(64bit) \
libkoformula.so.17()(64bit) \
libkokross.so.17()(64bit) \
libkomain.so.17()(64bit) \
libkomsooxml.so.17()(64bit) \
libkoodf.so.17()(64bit) \
libkoodf2.so.17()(64bit) \
libkoodfreader.so.17()(64bit) \
libkopageapp.so.17()(64bit) \
libkoplugin.so.17()(64bit) \
libkostore.so.17()(64bit) \
libkotext.so.17()(64bit) \
libkotextlayout.so.17()(64bit) \
libkovectorimage.so.17()(64bit) \
libkoversion.so.17()(64bit) \
libkowidgets.so.17()(64bit) \
libkowidgetutils.so.17()(64bit) \
libkundo2.so.17()(64bit) \
libpigmentcms.so.17()(64bit) \
qt5qmlimport(org.kde.calligra.1)"

RDEPENDS:${PN} += "/sbin/ldconfig \
kcoreaddons \
ld-linux-aarch64.so.1()(64bit) \
libKChart.so.2()(64bit) \
libKF5Activities.so.5()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5KrossCore.so.5()(64bit) \
libKF5KrossUi.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5SonnetCore.so.5()(64bit) \
libKF5SonnetUi.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5Wallet.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libcalligrasheetscommon.so.17()(64bit) \
libcalligrasheetsodf.so.17()(64bit) \
libcalligrastageprivate.so.17()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libodfgen-0.1.so.1()(64bit) \
libphonon4qt5.so.4()(64bit) \
libphonon4qt5experimental.so.4()(64bit) \
libqca-qt5.so.2()(64bit) \
librevenge-0.0.so.0()(64bit) \
librevenge-stream-0.0.so.0()(64bit) \
libspnav.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libvisio-0.1.so.1()(64bit) \
libwordsprivate.so.17()(64bit) \
libwpg-0.3.so.3()(64bit)"

inherit rpm
