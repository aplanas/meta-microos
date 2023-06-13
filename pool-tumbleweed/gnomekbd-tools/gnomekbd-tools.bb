SUMMARY = "GNOME Keyboard tools"
DESCRIPTION = "GNOME keyboard library and utility. \
 \
This package provides various binaries and conversion tools for \
libgnomekbd."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28.1"

RPM_NAME = "gnomekbd-tools-3.28.1-1.3.aarch64.rpm"
RPM_HASH = "60a2c427899d0a70127d50809e99ce13ce7ebc31ea8105a1af1b3ca3c3e28daf3e460a9548f1baa784b1f97c5b3f6e709441edf7ade8883bf1de73a2e3a3b4ed"

RPROVIDES:${PN} += "application() \
application(gkbd-keyboard-display.desktop) \
gnomekbd-tools \
gnomekbd-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnomekbdui.so.8()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libxklavier.so.16()(64bit)"

inherit rpm
