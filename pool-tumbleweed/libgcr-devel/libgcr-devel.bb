SUMMARY = "Development files for gcr, a library for crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "libgcr-devel-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "a56dd9b5feea72483611f8fc8d41b061f00d0d0a2c6b2a50838380a58d3808cccfbe0bbaf8b5090a8b766ab03dbe5f21948a4d28aeea5a3faf3db80403f63ceb"

RPROVIDES:${PN} += "libgcr-devel \
libgcr-devel(aarch-64) \
pkgconfig(gcr-4)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgcr-4-4 \
pkgconfig(gck-2) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(p11-kit-1) \
typelib-1_0-Gcr-4"

inherit rpm
