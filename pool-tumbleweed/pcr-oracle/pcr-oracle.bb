SUMMARY = "Predict TPM PCR values"
DESCRIPTION = "This utility tries to predict the values of the TPM's Platform \
Configuration Registers following an update of system components \
like shim, grub, etc."
LICENSE = "GPL-2.0-only"

PV = "0.4.6"

RPM_NAME = "pcr-oracle-0.4.6-1.1.aarch64.rpm"
RPM_HASH = "12b7753d2929785a45c3f8c3ea5fadece90e1bf897b3a30503756878a38c598b4041470959d8532585dcfd4972d667d88b71ed63c70788e0c3e36add693f7e1e"

RPROVIDES:${PN} += "pcr-oracle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtss2-esys.so.0 \
libtss2-mu.so.0 \
libtss2-rc.so.0"

inherit rpm
