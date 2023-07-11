SUMMARY = "Development files for gcr, a library for crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "libgcr-devel-4.1.0-1.2.aarch64.rpm"
RPM_HASH = "7586098a61b523cdf26e26eaacfabbe837de849413fd1dc4cfd3edb010ecace61588ee399d3f0e275d1079b2587cc57296ab8c7d86fa61ffb8bf8fd5b7618c3f"

RPROVIDES:${PN} += "libgcr-devel \
pkgconfig-gcr-4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgcr-4-4 \
pkgconfig-gck-2 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-p11-kit-1 \
typelib-1-0-Gcr-4"

inherit rpm
