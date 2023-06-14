SUMMARY = "Simple PIN or Passphrase Entry Dialog for GNOME"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using GNOME libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-gnome3-1.2.1-2.3.aarch64.rpm"
RPM_HASH = "2fd676450ebf9fee552c85e92bcebc97a8e05a0a59c546aa36efed69326c8113cd3b2ab93ba1762e9272b5d76cdf44710f3a8dec95bb9b65473a440d35ff5310"

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
