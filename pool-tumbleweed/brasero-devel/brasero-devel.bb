SUMMARY = "Development files for Brasero, a CD/DVD burning application for GNOME"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write CD/DVDs. \
This package contains the development files."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3"

RPM_NAME = "brasero-devel-3.12.3-2.8.aarch64.rpm"
RPM_HASH = "d9e778606db8bd7a9532315205ad4a4adcd0898ce7a03934312d2e36b975db1c105ef04310ee78b02e63433840f58a41cb7aa6d7330e0f9a7c9e2f85bdfc89cb"

RPROVIDES:${PN} += "brasero-devel \
pkgconfig-libbrasero-burn3 \
pkgconfig-libbrasero-media3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
brasero \
libbrasero-burn3-1 \
libbrasero-media3-1 \
libbrasero-utils3-1 \
pkgconfig-glib-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-BraseroBurn-3-2-0 \
typelib-1-0-BraseroMedia-3-2-0"

inherit rpm
