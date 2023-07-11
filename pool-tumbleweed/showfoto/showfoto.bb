SUMMARY = "DigiKam: Showfoto"
DESCRIPTION = "Additional program to browse and view photos"
LICENSE = "GPL-2.0-or-later"

PV = "8.0.0"

RPM_NAME = "showfoto-8.0.0-4.1.aarch64.rpm"
RPM_HASH = "bf4599fe667cd3e9cda24b31136eedccfd07c539b204ebc7a27bc969644b941a7d67a1d774a00a169ac746a47659c9e60c3dbd789dc1d65af8bc0b6ade9352e5"

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
