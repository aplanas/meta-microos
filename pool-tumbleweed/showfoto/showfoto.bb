SUMMARY = "DigiKam: Showfoto"
DESCRIPTION = "Additional program to browse and view photos"
LICENSE = "GPL-2.0-or-later"

PV = "8.0.0"

RPM_NAME = "showfoto-8.0.0-3.2.aarch64.rpm"
RPM_HASH = "f01785e0429cd2578059bcea25368c7249f1c8a29e2868525eb0557de4253f6d2996ad6c005375dae72a9d3374a48acfba51bc5d71905431e3bb4b37fa2f5afc"

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
libdigikamcore.so.8.0.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
