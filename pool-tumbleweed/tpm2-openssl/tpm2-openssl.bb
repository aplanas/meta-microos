SUMMARY = "OpenSSL 3 Engine for TPM2 devices"
DESCRIPTION = "Makes the TPM 2.0 accessible via the standard OpenSSL API and command-line tools, so \
one can add TPM support to (almost) any OpenSSL 3.x based application."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "tpm2-openssl-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "d3d7f7ee65cd080caf0e5c291606751a00bacc9cbd1e434f5f7951d168bbcc6736c7213d360c4235ba28d6b5a0383d018a75da2414a3642edd3852beba87c4d9"

RPROVIDES:${PN} += "tpm2-openssl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libtss2-esys.so.0 \
libtss2-rc.so.0 \
libtss2-tctildr.so.0"

inherit rpm
