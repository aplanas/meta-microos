SUMMARY = "Tupi plugins"
DESCRIPTION = "A design and authoring tool for 2D animation. \
 \
This package contains plugins for tupitube."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "0.2.18"

RPM_NAME = "tupitube-plugins-0.2.18-3.4.aarch64.rpm"
RPM_HASH = "5121a0964cce276624635fb8041eba5814e357ca082e37c272e811cf33b52aee9179068eae3cca6c7a70e5f62e304598dfe564b12572eb26511ebd907f5999d9"

RPROVIDES:${PN} += "libtupicoloringtool.so \
libtupieyedropper.so \
libtupifilltool.so \
libtupigeometrictool.so \
libtupiimageplugin.so \
libtupiinktool.so \
libtupimotiontool.so \
libtupinodestool.so \
libtupiopacitytool.so \
libtupipapagayotool.so \
libtupipenciltool.so \
libtupipolylinetool.so \
libtupirotationtool.so \
libtupiscaletool.so \
libtupiselectiontool.so \
libtupisheartool.so \
libtupitexttool.so \
tupitube-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtupi.so.1 \
libtupibase.so.1 \
libtupifwcore.so.1 \
libtupifwgui.so.1 \
libtupiplugincommon.so.1 \
libtupistore.so.1 \
tupitube"

inherit rpm
