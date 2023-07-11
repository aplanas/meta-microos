SUMMARY = "Development Headers, Documentation, and Libraries for Pidgin"
DESCRIPTION = "The pidgin-devel package contains the header files, developer \
documentation, and libraries required for development of Pidgin scripts \
and plugins."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "pidgin-devel-2.14.12-1.4.aarch64.rpm"
RPM_HASH = "eb9a6c2be20b625d1aef992967dad3daa81b3a47667b417c5484c2c80f4bcce119972a8dcfa6e73f26a50490365cbce5d9f5c1e7942a7686a61505e2b5e4fcb9"

RPROVIDES:${PN} += "pidgin-devel \
pkgconfig-pidgin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpurple-devel \
pidgin \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-2.0 \
pkgconfig-purple"

inherit rpm
