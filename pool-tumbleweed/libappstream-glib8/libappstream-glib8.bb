SUMMARY = "AppStream Abstraction Library"
DESCRIPTION = "This library provides GObjects and helper methods to read and write \
AppStream metadata. It also provides a DOM implementation to edit \
nodes and convert to and from the standardized XML representation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "libappstream-glib8-0.8.2-1.4.aarch64.rpm"
RPM_HASH = "85a58d079958a92a68022d70f452093bf85676a9654c7e7a7b4e68a95d22a3fc7bf324bba08791caefb77d23e30d45c59e7cee56db541d78901e31be41dee858"

RPROVIDES:${PN} += "libappstream-glib.so.8 \
libappstream-glib8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
librpmio.so.9 \
libuuid.so.1 \
libyaml-0.so.2"

inherit rpm
