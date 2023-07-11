SUMMARY = "Development Files for liblightdm-gobject-1-0"
DESCRIPTION = "This package contains development files needed for developing \
GObject-based LightDM clients."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "lightdm-gobject-devel-1.32.0-2.3.aarch64.rpm"
RPM_HASH = "563ed3a003eff0eefe7bbdc2cf01862e0381f9bd2da99c435ac4619ac79f00ee3098669f711e082d71735707597652a16a723dac7f046bfdc5d5561ee3732196"

RPROVIDES:${PN} += "lightdm-gobject-devel \
pkgconfig-liblightdm-gobject-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblightdm-gobject-1-0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxklavier \
pkgconfig-x11"

inherit rpm
