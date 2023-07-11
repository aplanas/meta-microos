SUMMARY = "A tilemap editor"
DESCRIPTION = "Tiled is a general purpose tile map editor. It is built to work with \
varying game engines, whether your game is an RPG, platformer or \
Breakout clone. Tiled is written in C++, using the Qt application \
framework."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.1"

RPM_NAME = "tiled-1.10.1-1.2.aarch64.rpm"
RPM_HASH = "c782569c0b7aa1b80f0b55f564fa31d36cd429f74506439dab3806160d5aaa2c83d313b8152a28d9eefbe95ceb458130bd769f1de9f5a756e187d0ff73afe32a"

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
