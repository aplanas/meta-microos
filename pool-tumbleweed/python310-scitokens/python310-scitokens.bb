SUMMARY = "SciToken reference implementation library"
DESCRIPTION = "SciTokens provide a token format for distributed authorization. The tokens are \
self-describing, can be verified in a distributed fashion (no need to contact \
the issuer to determine if the token is valid). This is convenient for a \
federated environment where several otherwise-independent storage endpoints \
want to delegate trust for an issuer for managing a storage allocation."
LICENSE = "Apache-2.0"

PV = "1.7.4"

RPM_NAME = "python310-scitokens-1.7.4-1.3.noarch.rpm"
RPM_HASH = "b24c13f083d3e5d3b3990985028a2b566375a0721f821c1459a3fa73f12935fcc5630c59f08d27dc2f1cbf879e5f6773edc55785c0c1035a14bf41fda8faa519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-scitokens \
python310-scitokens \
python3dist-scitokens"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyJWT \
update-alternatives"

inherit rpm
