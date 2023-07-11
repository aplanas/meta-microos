SUMMARY = "Development files for libxklavier"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.0-or-later"

PV = "5.4"

RPM_NAME = "libxklavier-devel-5.4-1.8.aarch64.rpm"
RPM_HASH = "b06cd68f6b0faff8878ba62ad428a4219298c9b54d78869a5c0fe7d2faf89c6d28a41b8cb6c9d27fc9598e7e146edd036db2d97a1a9939f5b2f546f31e50f13a"

RPROVIDES:${PN} += "libxklavier-devel \
pkgconfig-libxklavier"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libxklavier \
libxklavier16 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-Xkl-1-0"

inherit rpm
