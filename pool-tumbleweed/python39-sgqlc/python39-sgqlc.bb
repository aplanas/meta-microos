SUMMARY = "Simple GraphQL Client"
DESCRIPTION = "This package offers an easy to use GraphQL client. GraphQL is a query \
language for APIs and a runtime for fulfilling those queries with your \
existing data."
LICENSE = "ISC"

PV = "16.3"

RPM_NAME = "python39-sgqlc-16.3-1.1.noarch.rpm"
RPM_HASH = "b047777d81b4d8dd2f11b72a01a805a9d6e89bd5ae12fea9d386ad90a8dc41aed8b3b1580de24ffed8ac57a2cd93c0229826604946eaef939cc4b8524c737361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sgqlc \
python39-sgqlc \
python3dist-sgqlc"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-graphql-core \
update-alternatives"

inherit rpm
