SUMMARY = "TPM2 FAPI policy library"
DESCRIPTION = "Library that exposes the internal FAPI policy engine as a consumable \
library and stable API. Users can take arbitrary JSON policy strings \
and implement the callbacks required to produce calculated policies \
without a TPM as well as execute policies on an ESYS TR session for \
satisfying access policies on an object."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-policy0-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "774443e0f07e9feb34e50d5bfaae7a806647343faf5788624ef55de46dc703c57b1de629872205452075129f9ef2c7e4dbac4561c2794ce50448595e766b3ac2"

RPROVIDES:${PN} += "libtss2-policy.so.0 \
libtss2-policy0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjson-c.so.5 \
libtss2-esys.so.0 \
libtss2-mu.so.0"

inherit rpm
