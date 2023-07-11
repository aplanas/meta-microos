SUMMARY = "Tools required for Full Disk Encryption"
DESCRIPTION = "This package provides several components required to support Full Disk \
Encryption."
LICENSE = "GPL-2.0-only"

PV = "0.6.5"

RPM_NAME = "fde-tools-0.6.5-2.1.aarch64.rpm"
RPM_HASH = "8021bac5be57def4d84ae119acd196dd86abbe68446ce57b014a3f8c5646843e7e8fff259ad397f90d792de6e96475ccc950637b3e53102b75ac3d62c5d6388f"

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
