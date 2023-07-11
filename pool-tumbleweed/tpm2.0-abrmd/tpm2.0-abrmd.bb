SUMMARY = "Intel's TCG Software Stack Access Broker & Resource Manager for TPM 2.0 chips"
DESCRIPTION = "The tpm2.0-abrmd package provides the TPM2 Access Broker & Resource Manager. \
This is a daemon service that coordinates requests to the TPM2 chip via \
Intel's TPM 2.0 software stack."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "tpm2.0-abrmd-3.0.0-2.2.aarch64.rpm"
RPM_HASH = "307ce623f97bc4b07d4c463a963b9a6079a26ed5d2bb9c59ff26591c615ebba53cc58ed9d963d92b0b38fc8795cb277741552d8168ec93cbe5007003fe962b8f"

RPROVIDES:${PN} += "tpm2.0-abrmd"

RDEPENDS:${PN} += "/usr/bin/sh \
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
