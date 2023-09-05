SUMMARY = "Plugin for Okular"
DESCRIPTION = "Plugins for Okular supporting files in the formats ODP, ODT, MS DOC/DOCX, MS PPT/PPTX, and WPD."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-okular-3.2.1-7.22.aarch64.rpm"
RPM_HASH = "b71416a43fa1cbb1a2465ab7da60229062545c9b34baa3360dfefdd36d4c2fd2ee9517aa706877642a7e558f712bc1538f3cbbe7b611cf6d03de94d2b70a7cbe"

RPROVIDES:${PN} += "calligra-extras-okular \
libkookularGenerator-odp.so.17 \
libkookularGenerator-odt.so.17"

RDEPENDS:${PN} += "/sbin/ldconfig \
calligra \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libOkular5Core.so.11 \
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
