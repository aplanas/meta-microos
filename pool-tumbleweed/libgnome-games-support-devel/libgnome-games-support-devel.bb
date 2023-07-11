SUMMARY = "Development files for the GNOME Internal games library"
DESCRIPTION = "libgnome-games-support is a small library intended for internal use by \
GNOME Games, but it may be used by others. The API will only break \
with the major version number. The ABI is unstable."
LICENSE = "LGPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "libgnome-games-support-devel-2.0.0-1.8.aarch64.rpm"
RPM_HASH = "88cae05551221b6eb929d3536b0f28b91775e564b4427582df343cf4279bd7dbcf6232d7f1948efcdb2033bbc748a0a53cae86273e0ffd2b7eff965e30aa4a35"

RPROVIDES:${PN} += "libgnome-games-support-devel \
pkgconfig-libgnome-games-support-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnome-games-support-2-4 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk4"

inherit rpm
