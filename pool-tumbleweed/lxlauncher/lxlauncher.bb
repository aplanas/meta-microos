SUMMARY = "Open source clone of Asus launcher for Netbooks"
DESCRIPTION = "LXLauncher is an open source clone of Asus launcher for \
EeePC or Netbooks anyway. It's an LXDE project and it's \
based on menu-cache library."
LICENSE = "GPL-3.0"

PV = "0.2.5"

RPM_NAME = "lxlauncher-0.2.5-17.26.aarch64.rpm"
RPM_HASH = "53d034291b16134390287f42828bb9245569b22590d1aeab6d80b0ccdea5972fcebd120dffb646929e4d8d37300374810ad7c64bbb9a9d6974e2d5c94c75c491"

RPROVIDES:${PN} += "config-lxlauncher \
lxlauncher"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libmenu-cache.so.3 \
libstartup-notification-1.so.0"

inherit rpm
