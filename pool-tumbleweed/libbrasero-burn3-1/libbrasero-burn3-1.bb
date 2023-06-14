SUMMARY = "Brasero composition utility function library"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write CD/DVDs. \
 \
This subpackage contains a library of Brasero with utility functions related to \
abstract disc image composition (files and audio tracks)."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3"

RPM_NAME = "libbrasero-burn3-1-3.12.3-2.7.aarch64.rpm"
RPM_HASH = "654bfa2f99dbf2402f658e03270e4e816745c74c1a84c3685fe91b99842be168c4ac8540520d365f88077a0a3e80435589941fbf9839294b564b05abc06e2559"

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
