SUMMARY = "Source code editing widget development headers"
DESCRIPTION = "Development files related to libgedit-gtksourceview."
LICENSE = "LGPL-2.1-or-later"

PV = "299.0.3"

RPM_NAME = "libgedit-gtksourceview-devel-299.0.3-1.1.aarch64.rpm"
RPM_HASH = "21019fc04f6f8b4e43bbf5fe54d423759f2ad55146f2beb6def9c4a4b66bc8765809b7dc0e0c979de65cca10b70505ad86c2ddb12dfa3ddd809c95c8fd4195b5"

RPROVIDES:${PN} += "libgedit-gtksourceview-devel \
pkgconfig-libgedit-gtksourceview-300"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgedit-gtksourceview-300-0 \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-GtkSource-300"

inherit rpm
