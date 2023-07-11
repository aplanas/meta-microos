SUMMARY = "Development files for libgit2-glib, a GLib wrapper library around libgit2"
DESCRIPTION = "libgit2-glib is a GLib wrapper library around the libgit2 git access library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libgit2-glib-devel-1.1.0-1.6.aarch64.rpm"
RPM_HASH = "ff43f842cad1df8374b136619a41b52db0a7ee2096368c59ad0ca5d136b364232cd24ce10e0646ce664d42c23adffb49a7a9dda7524457b0bda03d804d3ec8eb"

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
