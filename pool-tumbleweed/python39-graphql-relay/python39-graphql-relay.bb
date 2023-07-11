SUMMARY = "Relay implementation for Python"
DESCRIPTION = "Relay Library for GraphQL Python. \
 \
This is a library to allow the easy creation of Relay-compliant servers using \
the GraphQL Python reference implementation of a GraphQL server."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python39-graphql-relay-3.2.0-1.6.noarch.rpm"
RPM_HASH = "1b56b76a8ec18f9965a5b23d37f1d2db963a48517f18ce66a42285b3811992051012f86bb75d636950a2a1ac9b8f08952e242f03f22ea76ad4f09c6fb2217f4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-graphql-relay \
python39-graphql-relay \
python3dist-graphql-relay"

RDEPENDS:${PN} += "-python39-graphql-core >= 3.2 \
python-abi \
python39-promise"

inherit rpm
