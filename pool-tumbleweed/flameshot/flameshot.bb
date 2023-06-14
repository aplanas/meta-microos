SUMMARY = "Screenshot software"
DESCRIPTION = "A program to capture screenshots. \
 \
Features: \
 \
 * Customizable appearance \
 * Annotation and drawing tools \
 * DBus interface \
 * Export to file, web"
LICENSE = "GPL-3.0-only"

PV = "12.1.0"

RPM_NAME = "flameshot-12.1.0-2.1.aarch64.rpm"
RPM_HASH = "4d94f500d81b8e5d6528bc92a707dfe4e1b1130e7b8180f5d41b34fbc79198f4d79f2feb6d9be714b16be6dac692154d62b3475957dc40f32b854e44be8485a3"

RPROVIDES:${PN} += "flameshot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5GuiAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
