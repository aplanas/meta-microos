SUMMARY = "A tilemap editor"
DESCRIPTION = "Tiled is a general purpose tile map editor. It is built to work with \
varying game engines, whether your game is an RPG, platformer or \
Breakout clone. Tiled is written in C++, using the Qt application \
framework."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.1"

RPM_NAME = "tiled-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "6b2a0462142685dac1291b7c59bfc3e33866448308d9b1f4d1c48f8df3ae1c4ec7e4d6d43859169a9d20e42a23ad2d89f71b32c330958a893d777afa811230bc"

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

RDEPENDS:${PN} += "/bin/sh \
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
