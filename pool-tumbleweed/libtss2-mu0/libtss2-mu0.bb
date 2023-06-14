SUMMARY = "TPM2 marshaling/unmarshaling library"
DESCRIPTION = "Marshaling/Unmarshaling (MU) as described in the TCG TSS 2.0 \
Marshaling/Unmarshaling API Specification. This API provides a set of \
marshaling and unmarshaling functions for all data types defined by the TPM \
library specification."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-mu0-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "3b93aeb61bb2484d1c24f09fd5464058ef57f0000c477fc224f7c6fa7cdd492017764f8651256baf0dfe8bcc16ede16d418acdfed2cc4745a3c5a196e547840c"

RPROVIDES:${PN} += "libtss2-mu.so.0 \
libtss2-mu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
