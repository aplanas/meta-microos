SUMMARY = "SciToken reference implementation library"
DESCRIPTION = "SciTokens provide a token format for distributed authorization. The tokens are \
self-describing, can be verified in a distributed fashion (no need to contact \
the issuer to determine if the token is valid). This is convenient for a \
federated environment where several otherwise-independent storage endpoints \
want to delegate trust for an issuer for managing a storage allocation."
LICENSE = "Apache-2.0"

PV = "1.7.4"

RPM_NAME = "python39-scitokens-1.7.4-1.1.noarch.rpm"
RPM_HASH = "0d62068147555e9432fbf3a27f506fc29a04466c50cfb8477cda6ba540346f82b4aa5adaea631aace8c5e3122e68ccef427a632d967662e8597a5e9c21b8005c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(scitokens) \
python39-scitokens \
python3dist(scitokens)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PyJWT \
update-alternatives"

inherit rpm
