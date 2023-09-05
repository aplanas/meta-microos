SUMMARY = "Tools required for Full Disk Encryption"
DESCRIPTION = "This package provides several components required to support Full Disk \
Encryption."
LICENSE = "GPL-2.0-only"

PV = "0.6.9"

RPM_NAME = "fde-tools-0.6.9-1.1.aarch64.rpm"
RPM_HASH = "e9caec265aaa4fa6433dda760e85bff1c41d99f5fbdf4d1b51a1b60e5d368f363d1f00c12ceab5c23cdfa79568464f5a23f293407358da9b350f621f7940b76b"

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
