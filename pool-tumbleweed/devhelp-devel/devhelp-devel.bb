SUMMARY = "Development files for the GNOME Developer Help program"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME. \
 \
This package contains the development files for Devhelp."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "devhelp-devel-43.0-2.2.aarch64.rpm"
RPM_HASH = "cd7d2ea430abfb75563db16eba15c108f826c0cc33ac6dae4bfe0fa4442a5ca8579d0c76cae2237b54b4bdeaeba811acd62a4a82915c4544bb32955355a2e66f"

RPROVIDES:${PN} += "devhelp-devel \
pkgconfig-libdevhelp-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
devhelp \
pkgconfig-gio-2.0 \
pkgconfig-gsettings-desktop-schemas \
pkgconfig-gtk+-3.0 \
pkgconfig-webkit2gtk-4.1 \
typelib-1-0-Devhelp-3-0"

inherit rpm
