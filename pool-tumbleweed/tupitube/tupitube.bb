SUMMARY = "2D vectorial/animation tool"
DESCRIPTION = "Tupitube is a design and authoring tool for digital artists \
interested in 2D animation. Its source code is based on the KTooN \
project. \
 \
Some of its main features are: basic illustration tools (shapes, fill, \
text), gradient tools, onion skin, brushes editor, pencil with smoothness \
support and a basic object library (for SVG files and raster images). \
 \
Using its modules of animation and reproduction, 2D projects can be exported \
to several formats such as OGG, MPEG, AVI, MOV and SWF. Additionally, the \
option of exporting image arrays as output is available."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "0.2.18"

RPM_NAME = "tupitube-0.2.18-3.4.aarch64.rpm"
RPM_HASH = "17f2bc2f546115538afe1b225d2f596a4ba65dbd47da7ed7ab8776e7f5d3edc8338a4de4dbccd50c8f6fd5166d49f590e3cbe84e49f3130760b691ea4a98c631"

RPROVIDES:${PN} += "ktoon \
libjson-c.so.1 \
liblibmypaint.so.1 \
libqtmypaint.so.1 \
librasterbrushes.so.1 \
librastercolor.so.1 \
librastermain.so.1 \
libtupi.so.1 \
libtupibase.so.1 \
libtupibrush.so.1 \
libtupicolor.so.1 \
libtupicolorpalette.so.1 \
libtupiexport.so.1 \
libtupiexposure.so.1 \
libtupifwcore.so.1 \
libtupifwgui.so.1 \
libtupigui.so.1 \
libtupilibrary.so.1 \
libtupimport.so.1 \
libtupinet.so.1 \
libtupiplayer.so.1 \
libtupiplugincommon.so.1 \
libtupiscenes.so.1 \
libtupistore.so.1 \
libtupitimeline.so.1 \
libtupitwitter.so.1 \
libtupiworkspace.so.1 \
tupi \
tupitube"

RDEPENDS:${PN} += "/bin/bash \
ffmpeg \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5MultimediaWidgets.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libogg0 \
libquazip1-qt5.so.1.4.0 \
libstdc++.so.6 \
libtheora0 \
tupitube-plugins"

inherit rpm
