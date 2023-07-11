SUMMARY = "SciToken reference implementation library"
DESCRIPTION = "SciTokens provide a token format for distributed authorization. The tokens are \
self-describing, can be verified in a distributed fashion (no need to contact \
the issuer to determine if the token is valid). This is convenient for a \
federated environment where several otherwise-independent storage endpoints \
want to delegate trust for an issuer for managing a storage allocation."
LICENSE = "Apache-2.0"

PV = "1.7.4"

RPM_NAME = "python311-scitokens-1.7.4-1.3.noarch.rpm"
RPM_HASH = "ac78da36d4ed3a7a4f486e0ed76dc906b449f066533265592d517af4c1fe3ad956fee13cea9ff17da1ba96aa16e29ed1291c91ea6a530aa5679b6385c4f8d836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scitokens \
python3.11dist-scitokens \
python311-scitokens \
python3dist-scitokens"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyJWT \
update-alternatives"

inherit rpm
