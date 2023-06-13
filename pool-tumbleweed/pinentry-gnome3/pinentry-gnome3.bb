SUMMARY = "Simple PIN or Passphrase Entry Dialog for GNOME"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using GNOME libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-gnome3-1.2.1-2.3.aarch64.rpm"
RPM_HASH = "2fd676450ebf9fee552c85e92bcebc97a8e05a0a59c546aa36efed69326c8113cd3b2ab93ba1762e9272b5d76cdf44710f3a8dec95bb9b65473a440d35ff5310"

RPROVIDES:${PN} += "pinentry-dialog \
pinentry-gnome3 \
pinentry-gnome3(aarch-64) \
pinentry-gui \
pinentry:/usr/bin/pinentry-gnome3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libassuan.so.0()(64bit) \
libc.so.6()(64bit) \
libgcr-base-3.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpg-error.so.0()(64bit) \
libncursesw.so.6()(64bit) \
libsecret-1.so.0()(64bit) \
libtinfo.so.6()(64bit) \
pinentry"

inherit rpm
