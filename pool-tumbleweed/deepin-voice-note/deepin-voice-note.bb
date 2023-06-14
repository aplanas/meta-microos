SUMMARY = "Deepin Voice Note"
DESCRIPTION = "Voice Notes is a lightweight memo tool to make text notes and voice and audio \
recordings."
LICENSE = "GPL-3.0+"

PV = "5.10.18"

RPM_NAME = "deepin-voice-note-5.10.18-1.3.aarch64.rpm"
RPM_HASH = "42bac4ee383add31e7ae39985ab880e9058d2c1b1bad0902d4e334fe90fb339c853a04f26d33a12105f0a35501ad92c3bec57d6c01d93beaf535a6b13576c6df"

RPROVIDES:${PN} += "deepin-voice-note"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libdframeworkdbus.so.2 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libm.so.6 \
libstdc++.so.6 \
libvlc.so.5"

inherit rpm
