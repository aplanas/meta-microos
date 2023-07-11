SUMMARY = "TPM2 Enhanced System API (ESAPI)"
DESCRIPTION = "This API is a 1-to-1 mapping of the TPM2 commands documented in Part 3 of the \
TPM2 specification. Additionally there are asynchronous versions of each \
command. In addition to SAPI, the ESAPI performs tracking of meta data for \
TPM object and automatic calculation of session based authorization and \
encryption values. Both the synchronous and asynchronous API are exposed \
through this library."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-esys0-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "5263698c85baa74c6a45cae0856d797afa924c916c875e9a18a5519933ae82a89fca31e01117ee434d7a5e66bbb2e58d29b7f1a688fb9ea1cf06db186df79a0c"

RPROVIDES:${PN} += "libtss2-esys.so.0 \
libtss2-esys0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtss2-mu.so.0 \
libtss2-sys.so.1"

inherit rpm
