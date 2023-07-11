SUMMARY = "Development files for libgsf, a structured file format handling library"
DESCRIPTION = "The libgsf library is an extensible I/O abstraction library for dealing \
with structured file formats."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.50"

RPM_NAME = "libgsf-devel-1.14.50-1.6.aarch64.rpm"
RPM_HASH = "043bae8cb7af2752e25ec7c50ecb1b4e82f2604c2f26da943ed831a2522bc8918739d6ae47666f54a2f20336467553d34a045a49f324937fb43c2164bbb1659e"

RPROVIDES:${PN} += "libgsf-devel \
libgsf-doc \
pkgconfig-libgsf-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgsf-1-114 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-Gsf-1"

inherit rpm
