SUMMARY = "Development files for gck, a GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "libgck1-devel-3.41.0-3.4.aarch64.rpm"
RPM_HASH = "1f3d531dba2124875c4884f54f1a3a7f0db179282272541568642ba6cccc0cf3ba199d87c820398bd2e36ee769a55c4215d898e132daf6e093fc7c193f0e7667"

RPROVIDES:${PN} += "libgck1-devel \
pkgconfig-gck-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgck-1-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-p11-kit-1 \
typelib-1-0-Gck-1"

inherit rpm
