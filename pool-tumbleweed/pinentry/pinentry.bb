SUMMARY = "Collection of Simple PIN or Passphrase Entry Dialogs"
DESCRIPTION = "This is a collection of simple PIN or passphrase entry dialogs which \
utilize the Assuan protocol as described by the Aegypten project."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-1.2.1-2.3.aarch64.rpm"
RPM_HASH = "e7bb391f59cfa69a77c58e1b330a23f32409f1540a533070fbe399072d66ada17126d7cda10acded32ec3ae56212aa9d80b564de79b717db1ea30434e263afed"

RPROVIDES:${PN} += "pinentry \
pinentry-dialog"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libgpg-error.so.0 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
