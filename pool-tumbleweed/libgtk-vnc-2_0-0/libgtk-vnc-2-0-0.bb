SUMMARY = "A GTK widget for VNC clients"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "libgtk-vnc-2_0-0-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "ec2be93be2bfd34fdce2b492da019e187a310d7e6cb97d8db5b9de720b8f0d6648e782fc3c07e188c06289eea5c43eb9ffcf1fced3b9bb4855f920e882d92682"

RPROVIDES:${PN} += "gtk-vnc \
libgtk-vnc-2.0.so.0()(64bit) \
libgtk-vnc-2_0-0 \
libgtk-vnc-2_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgvnc-1.0.so.0()(64bit)"

inherit rpm
