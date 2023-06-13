SUMMARY = "A tilemap editor"
DESCRIPTION = "Tiled is a general purpose tile map editor. It is built to work with \
varying game engines, whether your game is an RPG, platformer or \
Breakout clone. Tiled is written in C++, using the Qt application \
framework."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.1"

RPM_NAME = "tiled-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "6b2a0462142685dac1291b7c59bfc3e33866448308d9b1f4d1c48f8df3ae1c4ec7e4d6d43859169a9d20e42a23ad2d89f71b32c330958a893d777afa811230bc"

RPROVIDES:${PN} += "application() \
application(org.mapeditor.Tiled.desktop) \
libcsv.so()(64bit) \
libdefold.so()(64bit) \
libdefoldcollection.so()(64bit) \
libdroidcraft.so()(64bit) \
libflare.so()(64bit) \
libgmx.so()(64bit) \
libjson.so()(64bit) \
libjson1.so()(64bit) \
liblua.so()(64bit) \
libreplicaisland.so()(64bit) \
librpmap.so()(64bit) \
libtbin.so()(64bit) \
libtengine.so()(64bit) \
libtiled.so()(64bit) \
libtilededitor.so()(64bit) \
libtscn.so()(64bit) \
libyy.so()(64bit) \
metainfo() \
metainfo(org.mapeditor.Tiled.appdata.xml) \
mimehandler(application/x-tiled-tmx) \
mimehandler(application/x-tiled-tsx) \
tiled \
tiled(aarch-64) \
tiled-qt"

RDEPENDS:${PN} += "/bin/sh \
libQt6Concurrent.so.6()(64bit) \
libQt6Concurrent.so.6(Qt_6)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.4)(64bit) \
libQt6DBus.so.6()(64bit) \
libQt6DBus.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6OpenGLWidgets.so.6()(64bit) \
libQt6OpenGLWidgets.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libz.so.1()(64bit)"

inherit rpm
