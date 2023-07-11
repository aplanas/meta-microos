SUMMARY = "Simple PIN or Passphrase Entry Dialog for GNOME"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using GNOME libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-gnome3-1.2.1-3.1.aarch64.rpm"
RPM_HASH = "30089d04c8b501e5ca422438e13acf8488b6e578d5a3f41d2624447f3bfcdb3c70380695d30d826f876748ff6ba8792657e69bb88ac100c0716db314a441afbd"

RPROVIDES:${PN} += "pinentry-/usr/bin/pinentry-gnome3 \
pinentry-dialog \
pinentry-gnome3 \
pinentry-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libgcr-base-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
libncursesw.so.6 \
libsecret-1.so.0 \
libtinfo.so.6 \
pinentry"

inherit rpm
