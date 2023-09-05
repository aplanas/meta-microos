SUMMARY = "Vector Drawing Application"
DESCRIPTION = "Karbon is the vector drawing application of the Calligra Suite."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-karbon-3.2.1-7.22.aarch64.rpm"
RPM_HASH = "473fc95df7e11b9b9e2525b8294aabf17d36c4e160eb017910309d0b98f22fd4b49b143b963775c1083b93a36897365a04359d9c0de41cb40d775b31c3302c4e"

RPROVIDES:${PN} += "calligra-karbon \
libkarboncommon.so.17 \
libkarbonui.so.17 \
libkdeinit5-karbon.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
calligra \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libflake.so.17 \
libgcc-s.so.1 \
libkomain.so.17 \
libkoodf.so.17 \
libkopageapp.so.17 \
libkoplugin.so.17 \
libkostore.so.17 \
libkovectorimage.so.17 \
libkowidgets.so.17 \
libkowidgetutils.so.17 \
libkundo2.so.17 \
libm.so.6 \
libpigmentcms.so.17 \
libpoppler.so.130 \
librevenge-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6 \
libwpg-0.3.so.3 \
pstoedit"

inherit rpm
