SUMMARY = "Simple GraphQL Client"
DESCRIPTION = "This package offers an easy to use GraphQL client. GraphQL is a query \
language for APIs and a runtime for fulfilling those queries with your \
existing data."
LICENSE = "ISC"

PV = "16.3"

RPM_NAME = "python310-sgqlc-16.3-1.1.noarch.rpm"
RPM_HASH = "d75ee52fd5b92d969ffa6e1b901cc801eca0d429bc8b737254900ebe6289e0f121324fda8c74cc7937cef5b3c51dc1e9c9baea187fc4f7405f7d1e807cbc0f44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sgqlc \
python310-sgqlc \
python3dist-sgqlc"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-graphql-core \
update-alternatives"

inherit rpm
