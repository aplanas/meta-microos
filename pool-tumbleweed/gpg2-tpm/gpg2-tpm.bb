SUMMARY = "TPM2 support for GnuPG"
DESCRIPTION = "Version 2.3 of GnuPG introduced support for converting GPG private \
keys to TPM2 wrapped form.  This package enables that support.  The \
keytotpm command will not function unless this package is installed."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.8"

RPM_NAME = "gpg2-tpm-2.3.8-3.1.aarch64.rpm"
RPM_HASH = "c5031e350c4be216a4df4a151fa1b3d6567bc6e11809eb02b8df363c0d0829098cb34325d0b09e0c834c8792fb6df5b9946265586bbcbd19005c292b764ee66a"

RPROVIDES:${PN} += "gpg2-tpm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libgcrypt.so.20 \
libgpg-error.so.0 \
libibmtss.so.1 \
libnpth.so.0"

inherit rpm
