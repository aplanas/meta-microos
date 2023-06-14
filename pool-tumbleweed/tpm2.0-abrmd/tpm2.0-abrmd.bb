SUMMARY = "Intel's TCG Software Stack Access Broker & Resource Manager for TPM 2.0 chips"
DESCRIPTION = "The tpm2.0-abrmd package provides the TPM2 Access Broker & Resource Manager. \
This is a daemon service that coordinates requests to the TPM2 chip via \
Intel's TPM 2.0 software stack."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "tpm2.0-abrmd-3.0.0-2.1.aarch64.rpm"
RPM_HASH = "5e6aaf9ec3f49dcf55f61a2d9681e0443d00a6a6e287a2a50796208c3fef42fae77821159c0a2004b7ce0d62af7adc75431505b1161554a80db69491bbf74e70"

RPROVIDES:${PN} += "tpm2.0-abrmd"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtss2-mu.so.0 \
libtss2-rc.so.0 \
libtss2-sys.so.1 \
libtss2-tcti-device0 \
libtss2-tcti-tabrmd0 \
libtss2-tctildr.so.0 \
tpm2-0-tss \
user-tss"

inherit rpm
