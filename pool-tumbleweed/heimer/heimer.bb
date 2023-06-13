SUMMARY = "Mind map, diagram, and note-taking tool"
DESCRIPTION = "Heimer is a desktop application for creating mind maps and other \
suitable diagrams. Features: \
* Adjustable grid \
* Automatic layout optimization \
* Autosave \
* Easy-to-use UI \
* Export to PNG or SVG \
* Forever 100% free \
* Full undo/redo \
* Nice animations \
* Quickly add node text and edge labels \
* Save/load in XML-based .ALZ-files \
* Translations in English (default), Chinese, Dutch, Finnish, French, Italian, Spanish \
* Very fast \
* Zoom in/out/fit \
* Zoom with mouse wheel"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-only"

PV = "4.2.0"

RPM_NAME = "heimer-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "4784de7d4aeb975df511fcb053a7d64f4b77ef550cde629016785f1ea170d1df3e827df980058c8314e050c962c767229918bfc5eb0fe12321255ab0215b8439"

RPROVIDES:${PN} += "application() \
application(heimer.desktop) \
heimer \
heimer(aarch-64) \
metainfo() \
metainfo(heimer.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
