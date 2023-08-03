SUMMARY = "DigiKam: Showfoto"
DESCRIPTION = "Additional program to browse and view photos"
LICENSE = "GPL-2.0-or-later"

PV = "8.1.0"

RPM_NAME = "showfoto-8.1.0-1.1.aarch64.rpm"
RPM_HASH = "b7681761047316ed1c6c5da765515829a94dadeb46160cb76ab6931f2e9f72f3f870b4130696291e1c2b0ec6ebb2b108d5373d82819f22ee01dbbca76487e63c"

RPROVIDES:${PN} += "showfoto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5XmlGui.so.5 \
libMagick++-7.Q16HDRI.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libdigikamcore.so.8.1.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
