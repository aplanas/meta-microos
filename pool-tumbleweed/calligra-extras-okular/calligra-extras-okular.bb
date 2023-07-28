SUMMARY = "Plugin for Okular"
DESCRIPTION = "Plugins for Okular supporting files in the formats ODP, ODT, MS DOC/DOCX, MS PPT/PPTX, and WPD."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-okular-3.2.1-7.20.aarch64.rpm"
RPM_HASH = "989333adc5044ce6f61bb5bd6223d39bb0cf4bfc79edc24f71d6062aac5bcdc539141d3c2d2afc2b82d975232e3ad88f9f88a28647e70c3acf95845e97598814"

RPROVIDES:${PN} += "calligra-extras-okular \
libkookularGenerator-odp.so.17 \
libkookularGenerator-odt.so.17"

RDEPENDS:${PN} += "/sbin/ldconfig \
calligra \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libOkular5Core.so.10 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libflake.so.17 \
libgcc-s.so.1 \
libkomain.so.17 \
libkoodf.so.17 \
libkopageapp.so.17 \
libkotext.so.17 \
libkotextlayout.so.17 \
libkowidgets.so.17 \
libstdc++.so.6 \
libwordsprivate.so.17 \
okular"

inherit rpm
