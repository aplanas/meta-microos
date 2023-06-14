SUMMARY = "GNOME service to access online accounts -- Client Library"
DESCRIPTION = "gnome-online-accounts provides interfaces so applications and \
libraries in GNOME can access the user's online accounts."
LICENSE = "LGPL-2.0-or-later"

PV = "3.48.0"

RPM_NAME = "libgoa-1_0-0-3.48.0-1.1.aarch64.rpm"
RPM_HASH = "8e515f299e91caa9add002835a516c0a8bc5d38dd04cbbdad8a04bc18f801f2715cc51a2d59b1503f8e841906cb2f49ccac8dd0c4073020199415c92ad901420"

RPROVIDES:${PN} += "libgoa-1-0-0 \
libgoa-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
