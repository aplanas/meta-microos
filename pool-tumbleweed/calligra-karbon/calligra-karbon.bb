SUMMARY = "Vector Drawing Application"
DESCRIPTION = "Karbon is the vector drawing application of the Calligra Suite."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-karbon-3.2.1-7.20.aarch64.rpm"
RPM_HASH = "6749fb70677cbfb0a90afb36d33042af67572efa2eec9d219dd5421b035b1b51607dd41cb4f4f79f527077eafd5b90cca4f58b3bae6ddb37eaa667e759de7bc1"

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
