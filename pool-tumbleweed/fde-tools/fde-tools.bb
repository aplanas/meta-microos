SUMMARY = "Tools required for Full Disk Encryption"
DESCRIPTION = "This package provides several components required to support Full Disk \
Encryption."
LICENSE = "GPL-2.0-only"

PV = "0.6.8"

RPM_NAME = "fde-tools-0.6.8-1.1.aarch64.rpm"
RPM_HASH = "99e030db2305e489bac431f12294e7a3e27dc17f7914557ddf59eedda2145b3a38e0fc6078092f2d98be15b53440def657168c4557ab268dca816df4a52ec07b"

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
pcr-oracle \
util-linux-systemd"

inherit rpm
