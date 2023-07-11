SUMMARY = "Development files for gtk-layer-shell"
DESCRIPTION = "Development files and headers for gtk-layer-shell"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "0.8.1"

RPM_NAME = "gtk-layer-shell-devel-0.8.1-1.2.aarch64.rpm"
RPM_HASH = "ec61a647451b3a0c6411d32de242d15bc985b6de39a41d432fc677c361674bb7c906e61ee0c4ec95481459e61bf92c86d63e4abd9a9dbec747f61e0cbcc3e90c"

RPROVIDES:${PN} += "gtk-layer-shell-devel \
pkgconfig-gtk-layer-shell-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtk-layer-shell0 \
pkgconfig-gtk+-3.0 \
pkgconfig-wayland-client \
typelib-1-0-GtkLayerShell-0-1"

inherit rpm
