SUMMARY = "Application for Creating Presentations"
DESCRIPTION = "Stage is the presentation application of the Calligra Suite."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-stage-3.2.1-7.17.aarch64.rpm"
RPM_HASH = "48d4515d02db502bc7a3a304d4fa1e794248b59a6a8580b18b507a6bd344cd5d6da4000358d3dc1362e2fe2a7795987fd1e4b5bcfef112b8e9c165ab9fb9022e"

RPROVIDES:${PN} += "calligra-stage \
libcalligrastageprivate.so.17 \
libkdeinit5-calligrastage.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
calligra \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libetonyek-0.1.so.1 \
libflake.so.17 \
libgcc-s.so.1 \
libkomain.so.17 \
libkomsooxml.so.17 \
libkoodf.so.17 \
libkoodf2.so.17 \
libkopageapp.so.17 \
libkoplugin.so.17 \
libkostore.so.17 \
libkotext.so.17 \
libkotextlayout.so.17 \
libkowidgets.so.17 \
libkowidgetutils.so.17 \
libkundo2.so.17 \
libm.so.6 \
libodfgen-0.1.so.1 \
libphonon4qt5.so.4 \
librevenge-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
