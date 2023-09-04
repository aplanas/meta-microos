SUMMARY = "KIWI - Dracut module for disk with embedded verity metadata"
DESCRIPTION = "This package contains the kiwi-verity dracut module which is used \
for booting oem images built with KIWI and configured to use an \
embedded verity metadata block via the embed_verity_metadata \
type attribute"
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "dracut-kiwi-verity-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "33438fd6676099ef3e2fa2560995fb3d2fdb4352e88728d2fe33637d259280b711c1e27f1b3a53014c4483275ca3bd7b78691c02c91ff4827542d9854c5fa138"

RPROVIDES:${PN} += "dracut-kiwi-verity"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dracut \
dracut-kiwi-lib \
libc.so.6"

inherit rpm
