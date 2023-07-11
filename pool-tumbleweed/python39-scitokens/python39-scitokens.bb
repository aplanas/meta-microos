SUMMARY = "SciToken reference implementation library"
DESCRIPTION = "SciTokens provide a token format for distributed authorization. The tokens are \
self-describing, can be verified in a distributed fashion (no need to contact \
the issuer to determine if the token is valid). This is convenient for a \
federated environment where several otherwise-independent storage endpoints \
want to delegate trust for an issuer for managing a storage allocation."
LICENSE = "Apache-2.0"

PV = "1.7.4"

RPM_NAME = "python39-scitokens-1.7.4-1.3.noarch.rpm"
RPM_HASH = "cf19d5fe0f208551d96868d8db224aaccbf2fde4c3486e3731f8476af99f90a3cb3c56095d3c55333a8d193765355f6f0107bd8657fe9f4018f989762fe84fb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-scitokens \
python39-scitokens \
python3dist-scitokens"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyJWT \
update-alternatives"

inherit rpm
