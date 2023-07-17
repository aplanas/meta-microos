SUMMARY = "Relay implementation for Python"
DESCRIPTION = "Relay Library for GraphQL Python. \
 \
This is a library to allow the easy creation of Relay-compliant servers using \
the GraphQL Python reference implementation of a GraphQL server."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python310-graphql-relay-3.2.0-2.1.noarch.rpm"
RPM_HASH = "e3414fab49324a6faf94c1aec89757e04ca191980dca0713f684ed01c93551e2a4937340a224d6b0776f25b2f6bb3b931518eea245d94dee31fdcdc5ea4e1d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-graphql-relay \
python310-graphql-relay \
python3dist-graphql-relay"

RDEPENDS:${PN} += "-python310-graphql-core >= 3.2 \
python-abi \
python310-promise"

inherit rpm
