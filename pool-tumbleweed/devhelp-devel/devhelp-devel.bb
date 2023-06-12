SUMMARY = "Development files for the GNOME Developer Help program"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME. \
 \
This package contains the development files for Devhelp."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "devhelp-devel-43.0-2.1.aarch64.rpm"
RPM_HASH = "9834102c7cb5226c418637e5ac9da875bbd53c82b7b4b7a31419d90d5128d5eaf05d00ab55a1a8e803afa4d3c8b773487bcfd495c55bed89229f6350ffe43d10"

RPROVIDES:${PN} += "devhelp-devel \
devhelp-devel(aarch-64) \
pkgconfig(libdevhelp-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
devhelp \
pkgconfig(gio-2.0) \
pkgconfig(gsettings-desktop-schemas) \
pkgconfig(gtk+-3.0) \
pkgconfig(webkit2gtk-4.1) \
typelib-1_0-Devhelp-3_0"

inherit rpm
