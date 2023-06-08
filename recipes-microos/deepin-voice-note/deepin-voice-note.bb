SUMMARY = "Deepin Voice Note"
DESCRIPTION = "Voice Notes is a lightweight memo tool to make text notes and voice and audio \
recordings."
LICENSE = "GPL-3.0+"

PV = "5.10.18"

RPM_NAME = "deepin-voice-note-5.10.18-1.3.aarch64.rpm"
RPM_HASH = "42bac4ee383add31e7ae39985ab880e9058d2c1b1bad0902d4e334fe90fb339c853a04f26d33a12105f0a35501ad92c3bec57d6c01d93beaf535a6b13576c6df"

RPROVIDES:${PN} += "application() application(deepin-voice-note.desktop) deepin-voice-note deepin-voice-note(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5WebChannel.so.5()(64bit) libQt5WebChannel.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdframeworkdbus.so.2()(64bit) libdtkcore.so.5()(64bit) libdtkgui.so.5()(64bit) libdtkwidget.so.5()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libvlc.so.5()(64bit)"

inherit rpm
