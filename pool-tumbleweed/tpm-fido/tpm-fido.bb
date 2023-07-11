SUMMARY = "Use your TPM2 as a FIDO 2FA token"
DESCRIPTION = "tpm-fido is FIDO token implementation for Linux that protects the token keys by using your system's TPM. tpm-fido uses Linux's uhid facility to emulate a USB HID device so that it is properly detected by browsers."
LICENSE = "MIT"

PV = "20230621.5f8828b"

RPM_NAME = "tpm-fido-20230621.5f8828b-1.1.aarch64.rpm"
RPM_HASH = "7fdb98f4aee00aa23e44481143130977f63944607376d24fdf02d42e4339113fe1c876e57d9e1c793ab64a007f137dcb8e573a18e79a6d7ffa2c25f291edd595"

RPROVIDES:${PN} += "tpm-fido \
tpm2-fido"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
pinentry-gui"

inherit rpm
