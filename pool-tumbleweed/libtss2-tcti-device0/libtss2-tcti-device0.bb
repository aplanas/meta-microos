SUMMARY = "TCTI interface library for using a native TPM device node"
DESCRIPTION = "TPM Command Transmission Interface library for communicating with a \
TPM device node. This provides direct access to the TPM through the Linux \
kernel driver."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-device0-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "ead48c32e1c8e80ee44a94281b71bda32f5aa97300d2b753478aaef221783deaade399587476dc0c6c55d013473075c3b48a424ab30f783f9c770be488ed5ca0"

RPROVIDES:${PN} += "libtss2-tcti-device.so.0 \
libtss2-tcti-device0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
