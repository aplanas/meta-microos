SUMMARY = "GNOME service to access online accounts"
DESCRIPTION = "gnome-online-accounts provides interfaces so applications and \
libraries in GNOME can access the user's online accounts."
LICENSE = "LGPL-2.0-or-later"

PV = "3.48.0"

RPM_NAME = "gnome-online-accounts-3.48.0-1.1.aarch64.rpm"
RPM_HASH = "275e1e6bd5321c4e1667ce10694323ae9e3e806bbf049ab0e36874c3b09add44dbaaf199dc7c304972a282b12a02f17e66ec905d1c22de011473e2c1b52005ac"

RPROVIDES:${PN} += "gnome-online-accounts \
libgoawebextension.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcr-base-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgoa-backend-1.0.so.1 \
libgobject-2.0.so.0 \
libkrb5.so.3 \
librest-1.0.so.0 \
libwebkit2gtk-4.1.so.0 \
p11-kit"

inherit rpm
