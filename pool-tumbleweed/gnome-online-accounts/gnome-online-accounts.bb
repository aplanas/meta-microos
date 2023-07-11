SUMMARY = "GNOME service to access online accounts"
DESCRIPTION = "gnome-online-accounts provides interfaces so applications and \
libraries in GNOME can access the user's online accounts."
LICENSE = "LGPL-2.0-or-later"

PV = "3.48.0"

RPM_NAME = "gnome-online-accounts-3.48.0-1.2.aarch64.rpm"
RPM_HASH = "ce42341ee1e2f69df4c2dda01f2317700e68920ce86493b189030f8bcab0388067ec136c44c10a2b8f89e0fdd5937ce1fa9213523897828038b75b649b940712"

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
