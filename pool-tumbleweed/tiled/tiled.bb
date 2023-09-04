SUMMARY = "A tilemap editor"
DESCRIPTION = "Tiled is a general purpose tile map editor. It is built to work with \
varying game engines, whether your game is an RPG, platformer or \
Breakout clone. Tiled is written in C++, using the Qt application \
framework."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.2"

RPM_NAME = "tiled-1.10.2-1.1.aarch64.rpm"
RPM_HASH = "b404116e5e5da36333ad33f2b13e133144b90fc31bb4709584a3fd41efab78e6db039e99ca58f3eae369b6d8b8e7a8d4967a2420c22cfcedb5b815340edab3d8"

RPROVIDES:${PN} += "libcsv.so \
libdefold.so \
libdefoldcollection.so \
libdroidcraft.so \
libflare.so \
libgmx.so \
libjson.so \
libjson1.so \
liblua.so \
libreplicaisland.so \
librpmap.so \
libtbin.so \
libtengine.so \
libtiled.so \
libtilededitor.so \
libtscn.so \
libyy.so \
tiled \
tiled-qt"

RDEPENDS:${PN} += "/usr/bin/sh \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
