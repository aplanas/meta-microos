SUMMARY = "Open source clone of Asus launcher for Netbooks"
DESCRIPTION = "LXLauncher is an open source clone of Asus launcher for \
EeePC or Netbooks anyway. It's an LXDE project and it's \
based on menu-cache library."
LICENSE = "GPL-3.0"

PV = "0.2.5"

RPM_NAME = "lxlauncher-0.2.5-17.26.aarch64.rpm"
RPM_HASH = "53d034291b16134390287f42828bb9245569b22590d1aeab6d80b0ccdea5972fcebd120dffb646929e4d8d37300374810ad7c64bbb9a9d6974e2d5c94c75c491"

RPROVIDES:${PN} += "config(lxlauncher) \
lxlauncher \
lxlauncher(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libmenu-cache.so.3()(64bit) \
libstartup-notification-1.so.0()(64bit)"

inherit rpm
