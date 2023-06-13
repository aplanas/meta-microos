SUMMARY = "A Color Picker"
DESCRIPTION = "A color picker program designed for Elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.5"

RPM_NAME = "colorpicker-1.1.5-1.17.aarch64.rpm"
RPM_HASH = "db7051422f57377300879c460ed7d13021f6c7b401c629425ef64a637fbe3425e67b1fa00ee97b75127ec88fd9329b3e550f1d2248ac27d4887fff3ee914495b"

RPROVIDES:${PN} += "application() \
application(com.github.ronnydo.colorpicker.desktop) \
colorpicker \
colorpicker(aarch-64) \
metainfo() \
metainfo(com.github.ronnydo.colorpicker.appdata.xml)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
