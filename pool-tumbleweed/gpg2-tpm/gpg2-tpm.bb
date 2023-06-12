SUMMARY = "TPM2 support for GnuPG"
DESCRIPTION = "Version 2.3 of GnuPG introduced support for converting GPG private \
keys to TPM2 wrapped form.  This package enables that support.  The \
keytotpm command will not function unless this package is installed."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.8"

RPM_NAME = "gpg2-tpm-2.3.8-2.1.aarch64.rpm"
RPM_HASH = "eddf65a3f379a88b95c3456782e2d96859c68ce5381210c7af5cd5a341d9ae3c9197f8891f7c057338fec09def7abfcee7dfdab0957f60eee06917dbf5249efc"

RPROVIDES:${PN} += "gpg2-tpm \
gpg2-tpm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libassuan.so.0()(64bit) \
libassuan.so.0(LIBASSUAN_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libgpg-error.so.0()(64bit) \
libgpg-error.so.0(GPG_ERROR_1.0)(64bit) \
libibmtss.so.1()(64bit) \
libnpth.so.0()(64bit) \
libnpth.so.0(NPTH_1.0)(64bit)"

inherit rpm
