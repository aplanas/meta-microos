SUMMARY = "C++ Implementation of the SciTokens Library"
DESCRIPTION = "SciTokens provide a token format for distributed authorization. The tokens are \
self-describing, can be verified in a distributed fashion (no need to contact \
the issuer to determine if the token is valid). This is convenient for a \
federated environment where several otherwise-independent storage endpoints \
want to delegate trust for an issuer for managing a storage allocation."
LICENSE = "Apache-2.0"

PV = "0.6.3"

RPM_NAME = "libSciTokens0-0.6.3-2.1.aarch64.rpm"
RPM_HASH = "19d411df6550bf21f854a0152ccb04e09eefad31bab755643813d75566f61c572a05ecb5e525d520d86f682b43b5fb5ae469d10994f38dce14c93464a1b7881f"

RPROVIDES:${PN} += "libSciTokens.so.0 \
libSciTokens0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
