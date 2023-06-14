SUMMARY = "Qt based Color Picker with popup menu"
DESCRIPTION = "QToolButton with color popup menu with lets you select a color. The popup \
featues a color dialog button which can be used to add custom colors to the \
popup menu."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "libkColorPicker0-0.2.0-1.5.aarch64.rpm"
RPM_HASH = "35366af12a8d623291144eacbd103524d2944723bfcb552f37c27029fc65fa5c308c592781e667501ecc79f8554bea49d139d62cc25b62ace15cc91fb1c7bc87"

RPROVIDES:${PN} += "libkColorPicker.so.0 \
libkColorPicker0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
