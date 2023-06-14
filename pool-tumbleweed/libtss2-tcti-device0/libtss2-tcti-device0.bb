SUMMARY = "TCTI interface library for using a native TPM device node"
DESCRIPTION = "TPM Command Transmission Interface library for communicating with a \
TPM device node. This provides direct access to the TPM through the Linux \
kernel driver."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-device0-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "72a4a0b0112c1bc6aaa201ec3a4f9adbf88c8bc0e61a5b73883d00e14f234dcb8e78d5de6b8a93a27adcffd9d137d22c03770d8d21994b42dec9eedebb6718af"

RPROVIDES:${PN} += "libtss2-tcti-device.so.0 \
libtss2-tcti-device0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
