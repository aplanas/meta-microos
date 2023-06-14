SUMMARY = "Demo binaries for the Granite development library"
DESCRIPTION = "Granite is an extension of GTK+. \
 \
This package contains a small demo application to show the granite widgets."
LICENSE = "LGPL-3.0-or-later & LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "granite-demo-6.2.0-1.7.aarch64.rpm"
RPM_HASH = "1c44634d6ccac9c39f39444f2de2d7ad14c7ef3c1078c4078adb33ab00f89ba39b1e78eff82b8fd91ca9880f58e560e9275a160259ab02f51b95433bd0f4cf77"

RPROVIDES:${PN} += "granite-demo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0"

inherit rpm
