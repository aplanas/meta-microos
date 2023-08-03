SUMMARY = "TCTI interface library for using a native TPM device node"
DESCRIPTION = "TPM Command Transmission Interface library for communicating with a \
TPM device node. This provides direct access to the TPM through the Linux \
kernel driver."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-device0-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "dcaaf9167d6b43bc2a03027a556254b4e693768dd4c34bf3f7dffc589624390bb8d39fe61434c718af5b9b64619bf41bef88a7c120c1aeb6a0fab7c8931d6c4f"

RPROVIDES:${PN} += "libtss2-tcti-device.so.0 \
libtss2-tcti-device0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
