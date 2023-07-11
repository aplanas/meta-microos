SUMMARY = "Brasero composition utility function library"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write CD/DVDs. \
 \
This subpackage contains a library of Brasero with utility functions related to \
abstract disc image composition (files and audio tracks)."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3"

RPM_NAME = "libbrasero-burn3-1-3.12.3-2.8.aarch64.rpm"
RPM_HASH = "cbb8922fb245941922886599f6aec21dd57732480818411008753e26236736507d0c2792ddaba4a96498e68a05c1b74e33d3d3ac96ef415e784322c529d6c059"

RPROVIDES:${PN} += "libbrasero-burn3-1 \
libbrasero-burn3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrasero-media3.so.1 \
libbrasero-utils3.so.1 \
libc.so.6 \
libcanberra-gtk3.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
libpango-1.0.so.0"

inherit rpm
