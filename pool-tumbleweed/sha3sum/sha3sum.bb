SUMMARY = "SHA-3 and Keccak checksum utility"
DESCRIPTION = "sha3sum contains command line utilities for the Keccak, SHA-3, SHAKE, and \
RawSHAKE checksum utilities \
 \
A subset of Keccak was specified by NIST as SHA-3 (Secure Hash Algorithm 3)."
LICENSE = "ISC"

PV = "1.2.2"

RPM_NAME = "sha3sum-1.2.2-1.9.aarch64.rpm"
RPM_HASH = "6d5518de95699c16cacecaecd2d35e56a676fde534746c38bd38f084607451467c5b44002265942db85bb5d021f28d0bf02e261fc585771b25ba869bf7668b08"

RPROVIDES:${PN} += "sha3sum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkeccak.so.1"

inherit rpm
