SUMMARY = "Predict TPM PCR values"
DESCRIPTION = "This utility tries to predict the values of the TPM's Platform \
Configuration Registers following an update of system components \
like shim, grub, etc."
LICENSE = "GPL-2.0-only"

PV = "0.4.6"

RPM_NAME = "pcr-oracle-0.4.6-2.1.aarch64.rpm"
RPM_HASH = "7e07af71680e5c1069d7fa581af1d88471a6c4cd80519e2eba4863998cbd626a75a0e4d4af882bfa1b5e2c96a3924b78dca6629bc4bcd9d50c0992da792f9c23"

RPROVIDES:${PN} += "pcr-oracle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtss2-esys.so.0 \
libtss2-mu.so.0 \
libtss2-rc.so.0 \
libtss2-tcti-device0"

inherit rpm
