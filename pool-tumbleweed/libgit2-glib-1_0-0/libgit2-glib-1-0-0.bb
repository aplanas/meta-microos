SUMMARY = "GLib wrapper library around libgit2"
DESCRIPTION = "libgit2-glib is a GLib wrapper library around the libgit2 git access library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libgit2-glib-1_0-0-1.1.0-1.7.aarch64.rpm"
RPM_HASH = "0f993863682ac77e91b2924396c6871f5142528e79cded7930629cb746351a12ea4538d5c0969ad203901764476f1721118670b71575df13cf1c0d498c9a2f69"

RPROVIDES:${PN} += "libgit2-glib-1-0-0 \
libgit2-glib-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libgit2.so.1.7 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
