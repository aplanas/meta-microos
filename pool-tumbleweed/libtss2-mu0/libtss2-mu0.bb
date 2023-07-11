SUMMARY = "TPM2 marshaling/unmarshaling library"
DESCRIPTION = "Marshaling/Unmarshaling (MU) as described in the TCG TSS 2.0 \
Marshaling/Unmarshaling API Specification. This API provides a set of \
marshaling and unmarshaling functions for all data types defined by the TPM \
library specification."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-mu0-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "478f2ce62550d7ac51fcb77700b707aeb4ae8da9755ebcfffc552fa24c104263aa018573a1b490d6e6587e337f9b5b775d9c1220c4ff7c8f4f351b5891d02018"

RPROVIDES:${PN} += "libtss2-mu.so.0 \
libtss2-mu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
