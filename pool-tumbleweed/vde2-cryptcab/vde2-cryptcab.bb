SUMMARY = "VDE ecryption module"
DESCRIPTION = "This package contains CryptCab, which can be used \
to send encrypted data over an UDP link."
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "vde2-cryptcab-2.3.2+svn587-3.24.aarch64.rpm"
RPM_HASH = "8c9bc3ebf19c0a1a97158eff3553b26f42c6f9093168065987f4e3954f749226ab08e0370f15b0fb6616a2c2364ca95306672b5ef3cf0c3238fc48f8a4692d4b"

RPROVIDES:${PN} += "vde2-cryptcab"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libvdeplug.so.3"

inherit rpm
