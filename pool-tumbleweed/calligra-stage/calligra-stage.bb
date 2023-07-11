SUMMARY = "Application for Creating Presentations"
DESCRIPTION = "Stage is the presentation application of the Calligra Suite."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-stage-3.2.1-7.19.aarch64.rpm"
RPM_HASH = "872741db139c694ea3991e2413584c498e0ddde8a2f180be441187d827ccf0f13606d7da16d4c9d54804045bda27bc55e2c465862e66618bf11cece98fec0be8"

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
