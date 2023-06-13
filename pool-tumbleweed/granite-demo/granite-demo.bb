SUMMARY = "Demo binaries for the Granite development library"
DESCRIPTION = "Granite is an extension of GTK+. \
 \
This package contains a small demo application to show the granite widgets."
LICENSE = "LGPL-3.0-or-later & LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "granite-demo-6.2.0-1.7.aarch64.rpm"
RPM_HASH = "1c44634d6ccac9c39f39444f2de2d7ad14c7ef3c1078c4078adb33ab00f89ba39b1e78eff82b8fd91ca9880f58e560e9275a160259ab02f51b95433bd0f4cf77"

RPROVIDES:${PN} += "application() \
application(io.elementary.granite.demo.desktop) \
granite-demo \
granite-demo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
