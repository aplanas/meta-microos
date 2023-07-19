SUMMARY = "Tools required for Full Disk Encryption"
DESCRIPTION = "This package provides several components required to support Full Disk \
Encryption."
LICENSE = "GPL-2.0-only"

PV = "0.6.5"

RPM_NAME = "fde-tools-0.6.5-3.1.aarch64.rpm"
RPM_HASH = "5b1805ac0c08f87116bb86f75df7ed7d56a0d060968ffd59548146d528c8aec265f8d5c8e394ac29757c73f52546864c8dcabb2a9417a187fa535758be073654"

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
