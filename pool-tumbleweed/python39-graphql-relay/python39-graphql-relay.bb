SUMMARY = "Relay implementation for Python"
DESCRIPTION = "Relay Library for GraphQL Python. \
 \
This is a library to allow the easy creation of Relay-compliant servers using \
the GraphQL Python reference implementation of a GraphQL server."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python39-graphql-relay-3.2.0-2.1.noarch.rpm"
RPM_HASH = "87d89d5408c95b86472135459b38af6897f5ccf5a716b8620135a948943e7030009a8ba876f3b7f128014a7bab684335dd80cd57c40fa7f799c51f78c97228ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-graphql-relay \
python39-graphql-relay \
python3dist-graphql-relay"

RDEPENDS:${PN} += "-python39-graphql-core >= 3.2 \
python-abi \
python39-promise"

inherit rpm
