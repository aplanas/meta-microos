SUMMARY = "Create shortcuts for LXDE"
DESCRIPTION = "LXShortcut is a small program used to edit application shortcuts \
created with freedesktop.org Desktop Entry spec."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "lxshortcut-1.3.2-1.13.aarch64.rpm"
RPM_HASH = "42b1a3603ebe395fd9e3ffb4e9ba3df73229b4e1d41bca3a7930a8882147f868c56fb44a7967ed111f629e96cfe57461a9ee609cbae0fd46f63989b9fa920d34"

RPROVIDES:${PN} += "lxshortcut"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfm-gtk.so.4 \
libfm.so.4 \
libglib-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
