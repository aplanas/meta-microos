SUMMARY = "SHA-3 and Keccak checksum utility"
DESCRIPTION = "sha3sum contains command line utilities for the Keccak, SHA-3, SHAKE, and \
RawSHAKE checksum utilities \
 \
A subset of Keccak was specified by NIST as SHA-3 (Secure Hash Algorithm 3)."
LICENSE = "ISC"

PV = "1.2.2"

RPM_NAME = "sha3sum-1.2.2-1.8.aarch64.rpm"
RPM_HASH = "f91775330de978a9c95231917cbab8e1c7c88693ebdad456b1b8c9d42ffa202b9414152c1f6cbb3a830afb53f5cd4889466a8bda214697c860931780e8b84ced"

RPROVIDES:${PN} += "sha3sum \
sha3sum(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkeccak.so.1()(64bit)"

inherit rpm
