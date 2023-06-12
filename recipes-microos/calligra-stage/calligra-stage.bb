SUMMARY = "Application for Creating Presentations"
DESCRIPTION = "Stage is the presentation application of the Calligra Suite."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-stage-3.2.1-7.17.aarch64.rpm"
RPM_HASH = "48d4515d02db502bc7a3a304d4fa1e794248b59a6a8580b18b507a6bd344cd5d6da4000358d3dc1362e2fe2a7795987fd1e4b5bcfef112b8e9c165ab9fb9022e"

RPROVIDES:${PN} += "application() application(org.kde.calligrastage.desktop) calligra-stage calligra-stage(aarch-64) libcalligrastageprivate.so.17()(64bit) libkdeinit5_calligrastage.so()(64bit) metainfo() metainfo(org.kde.calligrastage.appdata.xml) mimehandler(application/vnd.ms-powerpoint) mimehandler(application/vnd.oasis.opendocument.presentation) mimehandler(application/vnd.oasis.opendocument.presentation-template) mimehandler(application/vnd.openxmlformats-officedocument.presentationml.presentation) mimehandler(application/vnd.openxmlformats-officedocument.presentationml.template) mimehandler(application/x-kpresenter)"
RDEPENDS:${PN} += "/sbin/ldconfig calligra ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libetonyek-0.1.so.1()(64bit) libflake.so.17()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libkomain.so.17()(64bit) libkomsooxml.so.17()(64bit) libkoodf.so.17()(64bit) libkoodf2.so.17()(64bit) libkopageapp.so.17()(64bit) libkoplugin.so.17()(64bit) libkostore.so.17()(64bit) libkotext.so.17()(64bit) libkotextlayout.so.17()(64bit) libkowidgets.so.17()(64bit) libkowidgetutils.so.17()(64bit) libkundo2.so.17()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libodfgen-0.1.so.1()(64bit) libphonon4qt5.so.4()(64bit) librevenge-0.0.so.0()(64bit) librevenge-stream-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libz.so.1()(64bit)"

inherit rpm
