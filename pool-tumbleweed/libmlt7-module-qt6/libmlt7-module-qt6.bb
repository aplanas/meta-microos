SUMMARY = "Qt 6 module for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
The functionality of the system is provided via an assortment of \
tools, XML authoring components, and an plug-in based API. \
 \
This package provides a Qt 6 module for MLT."
LICENSE = "GPL-3.0-or-later"

PV = "7.14.0"

RPM_NAME = "libmlt7-module-qt6-7.14.0-2.2.aarch64.rpm"
RPM_HASH = "5d97b93ffc3f9dbf35feda24221a8c3b678b558193deba2c0466252502d33f9a92862738bded047a9b5e58c44520d53e5900457f1a5bc95a8926642c2a84856e"

RPROVIDES:${PN} += "libmlt7-module-qt6 \
libmltglaxnimate-qt6.so \
libmltqt6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libarchive.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmlt-7.so.7 \
libmlt7-modules \
libstdc++.so.6 \
libz.so.1"

inherit rpm
