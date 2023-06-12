SUMMARY = "Development files for the Adwaita library"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the development files for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.2"

RPM_NAME = "libadwaita-devel-1.3.2-1.1.aarch64.rpm"
RPM_HASH = "50ecf36da3789c4aacd48a4b7daad63bc5c3bc9492487763628f618a026cd3bb8ce5294cf5b50629620fdc03caa8475b341f7e6d97da9375037e8c845cd2f119"

RPROVIDES:${PN} += "libadwaita-devel \
libadwaita-devel(aarch-64) \
pkgconfig(libadwaita-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libadwaita-1-0 \
pkgconfig(fribidi) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gtk4) \
typelib-1_0-Adw-1"

inherit rpm
