SUMMARY = "Development files for Brasero, a CD/DVD burning application for GNOME"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write CD/DVDs. \
This package contains the development files."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3"

RPM_NAME = "brasero-devel-3.12.3-2.7.aarch64.rpm"
RPM_HASH = "587c020309689cae8273a68e41d35ba23d51f7079a9dd2efc12f951f57d6ea726c6dbc657b130d18cd2eef0cd9af31d7f75118cff677a92d4d10ec4197c1f234"

RPROVIDES:${PN} += "brasero-devel brasero-devel(aarch-64) pkgconfig(libbrasero-burn3) pkgconfig(libbrasero-media3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config brasero libbrasero-burn3-1 libbrasero-media3-1 libbrasero-utils3-1 pkgconfig(glib-2.0) pkgconfig(gthread-2.0) pkgconfig(gtk+-3.0) typelib-1_0-BraseroBurn-3_2_0 typelib-1_0-BraseroMedia-3_2_0"

inherit rpm
