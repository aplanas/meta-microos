SUMMARY = "Tools required for Full Disk Encryption"
DESCRIPTION = "This package provides several components required to support Full Disk \
Encryption."
LICENSE = "GPL-2.0-only"

PV = "0.6.6"

RPM_NAME = "fde-tools-0.6.6-2.1.aarch64.rpm"
RPM_HASH = "e326bdb85d16361328895e1c7bbf125ef82817780f6190f870d4962bddbed98376d9105be25a7bd8d1e22824ea59da0558c9f27ee92ac649d02ed68ce3603958"

RPROVIDES:${PN} += "fde-tools \
libcryptsetup-token-grub-tpm2.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
cryptsetup \
libc.so.6 \
libcrypto.so.3 \
libcryptsetup.so.12 \
libfido2.so.1 \
libjson-c.so.5 \
mokutil \
pcr-oracle"

inherit rpm
