SUMMARY = "Commandline tool for conversion"
DESCRIPTION = "Commandline tool for conversion between any file formats for which \
there is a chain of Calligra import/export filters."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-converter-3.2.1-7.21.aarch64.rpm"
RPM_HASH = "c36280a183d52e6aa2af1a4d17d3f7fc541f2309579f08b3d0893329aec4b7bd7e77c26d5031d9382fc4f12742edda33ac8b8345d8cff085a9e64e6e8b0fb8a8"

RPROVIDES:${PN} += "calligra-extras-converter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkomain.so.17 \
libkostore.so.17 \
libstdc++.so.6"

inherit rpm
