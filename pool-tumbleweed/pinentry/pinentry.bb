SUMMARY = "Collection of Simple PIN or Passphrase Entry Dialogs"
DESCRIPTION = "This is a collection of simple PIN or passphrase entry dialogs which \
utilize the Assuan protocol as described by the Aegypten project."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-1.2.1-3.1.aarch64.rpm"
RPM_HASH = "be3034773b04ba50d8e53a5cb24809337a219e9e27f61f9ddd5cdf0ea17627a07c85e1d2707b354a648b5ccf6cda892488680c27324e298ad8fc6624faf60f4c"

RPROVIDES:${PN} += "pinentry \
pinentry-dialog"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libgpg-error.so.0 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
