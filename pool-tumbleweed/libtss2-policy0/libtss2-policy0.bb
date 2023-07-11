SUMMARY = "TPM2 FAPI policy library"
DESCRIPTION = "Library that exposes the internal FAPI policy engine as a consumable \
library and stable API. Users can take arbitrary JSON policy strings \
and implement the callbacks required to produce calculated policies \
without a TPM as well as execute policies on an ESYS TR session for \
satisfying access policies on an object."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-policy0-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "bca17461f0f8e6fbbb15efd9b8f66d112446b4dea7937a1ae54c7a3821b3e9d16ee8b8bfd40af5f956745e1c4be437d007e3fe801f79616ad84e808661dc9294"

RPROVIDES:${PN} += "libtss2-policy.so.0 \
libtss2-policy0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjson-c.so.5 \
libtss2-esys.so.0 \
libtss2-mu.so.0"

inherit rpm
