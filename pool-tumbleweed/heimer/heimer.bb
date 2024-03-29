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

RPM_NAME = "heimer-4.2.0-1.2.aarch64.rpm"
RPM_HASH = "d513083fc37e7a1435cda97ee46e3f1789cd7f1466dc3908f1b1da85b4c13031db43dfccc4008a9281ab52c902dafe51eb49580aa663aca2cbd50759c14877b9"

RPROVIDES:${PN} += "heimer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
