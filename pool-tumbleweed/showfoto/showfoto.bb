SUMMARY = "DigiKam: Showfoto"
DESCRIPTION = "Additional program to browse and view photos"
LICENSE = "GPL-2.0-or-later"

PV = "8.1.0"

RPM_NAME = "showfoto-8.1.0-2.1.aarch64.rpm"
RPM_HASH = "97c22f979fd2300eb799891138de8c89ca25452cfa706d41e2e8a9d6d693cbac3e76cac493c4c74ab1c4e0921c8c09a65ad9b0670f9aeb7f949e78684f42b72e"

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
