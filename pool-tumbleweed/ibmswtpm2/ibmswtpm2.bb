SUMMARY = "IBM's Software TPM 2.0"
DESCRIPTION = "An implementation of the TCG TPM 2.0 specification. It is based on \
the TPM specification Parts 3 and 4 source code donated by Microsoft, \
with additional files to complete the implementation. \
 \
This TPM emulator listens on TCP ports (default 2321 and 2322) and \
saves state to the file 'NVChip' in the current directory. \
 \
It is probably not of much use other than testing the IBM TSS \
implementation because of this specific interface."
LICENSE = "BSD-3-Clause"

PV = "1682"

RPM_NAME = "ibmswtpm2-1682-2.4.aarch64.rpm"
RPM_HASH = "229935b78c459d921ea9978ccc1bc03ea9bf8dcc8d1ec45cea27ab298d439d7aa7416dd8ad8494a7558047d13d5fd99b37ab227f16e32f7010a1739b3145cf3c"

RPROVIDES:${PN} += "ibmswtpm2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
