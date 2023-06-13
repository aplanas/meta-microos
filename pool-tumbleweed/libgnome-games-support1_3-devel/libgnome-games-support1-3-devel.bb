SUMMARY = "Development files for the GNOME Internal games library"
DESCRIPTION = "libgnome-games-support is a small library intended for internal use by \
GNOME Games, but it may be used by others. The API will only break \
with the major version number. The ABI is unstable."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.2"

RPM_NAME = "libgnome-games-support1_3-devel-1.8.2-1.7.aarch64.rpm"
RPM_HASH = "1fae29a7fbb49b897e2cce75b2334579b00a2297cd3ccc9c8d2741ae4be0ca811f5c6957ffca8b4803d86a4ca492f5a6cc7aded28ce692e4ffb6bbcf6d332785"

RPROVIDES:${PN} += "libgnome-games-support1_3-devel \
libgnome-games-support1_3-devel(aarch-64) \
pkgconfig(libgnome-games-support-1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnome-games-support-1-3 \
pkgconfig(gee-0.8) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-3.0)"

inherit rpm
