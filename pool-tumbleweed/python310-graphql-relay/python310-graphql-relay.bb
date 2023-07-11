SUMMARY = "Relay implementation for Python"
DESCRIPTION = "Relay Library for GraphQL Python. \
 \
This is a library to allow the easy creation of Relay-compliant servers using \
the GraphQL Python reference implementation of a GraphQL server."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python310-graphql-relay-3.2.0-1.6.noarch.rpm"
RPM_HASH = "ffa50f8bdf51039f8fd413eeb9f349513c4f6c4dc0c54a5020404fcb811c639515d86cff07cd68310aca6933c09015a1218306a1beb1daae1a480ba0974b4e27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-graphql-relay \
python310-graphql-relay \
python3dist-graphql-relay"

RDEPENDS:${PN} += "-python310-graphql-core >= 3.2 \
python-abi \
python310-promise"

inherit rpm
