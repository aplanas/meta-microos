SUMMARY = "TPM2 marshaling/unmarshaling library"
DESCRIPTION = "Marshaling/Unmarshaling (MU) as described in the TCG TSS 2.0 \
Marshaling/Unmarshaling API Specification. This API provides a set of \
marshaling and unmarshaling functions for all data types defined by the TPM \
library specification."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-mu0-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "695fdea502e1c417fc9a5f8ddcd411ca34215ede86d4d7e384563ba58e4914ddf9f5e9cb60daf6b5ce8eb70f6245affcb2fd616e0396ba6f71bceefb9bb21641"

RPROVIDES:${PN} += "libtss2-mu.so.0 \
libtss2-mu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
