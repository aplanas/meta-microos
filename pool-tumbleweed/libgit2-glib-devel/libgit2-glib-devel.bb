SUMMARY = "Development files for libgit2-glib, a GLib wrapper library around libgit2"
DESCRIPTION = "libgit2-glib is a GLib wrapper library around the libgit2 git access library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libgit2-glib-devel-1.1.0-1.5.aarch64.rpm"
RPM_HASH = "17407c981a1330acc30564e5436d9a54ff1f60e8d06d51f5216206cd234ea2d634fe20f2085a408403187328d04ea1e64386b4604c72247e6a6ea8ca953dde4f"

RPROVIDES:${PN} += "libgit2-glib-devel \
pkgconfig-libgit2-glib-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgit2-glib-1-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libgit2 \
typelib-1-0-Ggit-1-0"

inherit rpm
