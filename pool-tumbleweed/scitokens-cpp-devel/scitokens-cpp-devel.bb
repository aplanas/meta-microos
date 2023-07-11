SUMMARY = "Header files for the libscitokens public interfaces"
DESCRIPTION = "SciTokens provide a token format for distributed authorization. The tokens are \
self-describing, can be verified in a distributed fashion (no need to contact \
the issuer to determine if the token is valid). This is convenient for a \
federated environment where several otherwise-independent storage endpoints \
want to delegate trust for an issuer for managing a storage allocation."
LICENSE = "Apache-2.0"

PV = "0.6.3"

RPM_NAME = "scitokens-cpp-devel-0.6.3-2.2.aarch64.rpm"
RPM_HASH = "a1cd5106acc3cea9119e48200bee66257bba6af3a4010fbb55e9ca1ecbc048de54526c80c66cf44f8f683d9aa61bbde143f575bebeb575fa23f23aabffd7f3f1"

RPROVIDES:${PN} += "scitokens-cpp-devel"

RDEPENDS:${PN} += "libSciTokens0"

inherit rpm
