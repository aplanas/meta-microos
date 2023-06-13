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

RPM_NAME = "ibmswtpm2-1682-2.3.aarch64.rpm"
RPM_HASH = "65df5e77d01e84bc81d5e5c2df465c4e5e80c71cf0708c7f1aae8ea1fc662f1fbf56f72e7654a541ad86fa94f468fd36b3731b78fe18fb1ec855316d80305693"

RPROVIDES:${PN} += "ibmswtpm2 \
ibmswtpm2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
