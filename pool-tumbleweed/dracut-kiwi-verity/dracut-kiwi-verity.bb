SUMMARY = "KIWI - Dracut module for disk with embedded verity metadata"
DESCRIPTION = "This package contains the kiwi-verity dracut module which is used \
for booting oem images built with KIWI and configured to use an \
embedded verity metadata block via the embed_verity_metadata \
type attribute"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "dracut-kiwi-verity-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "a21cd0af6d752fa62bd48e78817a99c4ff86bb80dfa819e591c32fbe57642e43d2b6fc6e8715d9cf432aa8c6460a681327cf6e5e59f6b90594bd9f4fcccf1c2b"

RPROVIDES:${PN} += "dracut-kiwi-verity"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dracut \
dracut-kiwi-lib \
libc.so.6"

inherit rpm
