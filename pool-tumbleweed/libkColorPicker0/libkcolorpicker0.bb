SUMMARY = "Qt based Color Picker with popup menu"
DESCRIPTION = "QToolButton with color popup menu with lets you select a color. The popup \
featues a color dialog button which can be used to add custom colors to the \
popup menu."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "libkColorPicker0-0.2.0-1.6.aarch64.rpm"
RPM_HASH = "fb543529498dbd649d08918f1c7cbefef2ccb1d0bffc787dbb778e662305a0d791189f96db8a0fcf8339980046d356ee833bc8ec4233eb14cd9c784e6de2059e"

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
