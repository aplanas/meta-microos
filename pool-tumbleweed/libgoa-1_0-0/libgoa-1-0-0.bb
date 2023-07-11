SUMMARY = "GNOME service to access online accounts -- Client Library"
DESCRIPTION = "gnome-online-accounts provides interfaces so applications and \
libraries in GNOME can access the user's online accounts."
LICENSE = "LGPL-2.0-or-later"

PV = "3.48.0"

RPM_NAME = "libgoa-1_0-0-3.48.0-1.2.aarch64.rpm"
RPM_HASH = "57f15f43054f7d1d0a4317c76c14720dc529e5defe009027624b90ac9a2666c55b716c4a4e40b909fd3d8b54a41a437995659c68d8a88d55a0abb5cb6fdc2d42"

RPROVIDES:${PN} += "libgoa-1-0-0 \
libgoa-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
