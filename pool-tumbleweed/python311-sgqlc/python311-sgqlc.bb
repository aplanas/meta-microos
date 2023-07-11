SUMMARY = "Simple GraphQL Client"
DESCRIPTION = "This package offers an easy to use GraphQL client. GraphQL is a query \
language for APIs and a runtime for fulfilling those queries with your \
existing data."
LICENSE = "ISC"

PV = "16.3"

RPM_NAME = "python311-sgqlc-16.3-1.1.noarch.rpm"
RPM_HASH = "337ef70dbf791f87556b24494a4a754519d53bf69ac40c22bbc8d874539060e02100db568964e924df194c5ac1dd85d3553efa452063d7dc5b394e8ea6988789"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sgqlc \
python3.11dist-sgqlc \
python311-sgqlc \
python3dist-sgqlc"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-graphql-core \
update-alternatives"

inherit rpm
