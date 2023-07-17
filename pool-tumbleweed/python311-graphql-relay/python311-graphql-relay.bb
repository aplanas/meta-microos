SUMMARY = "Relay implementation for Python"
DESCRIPTION = "Relay Library for GraphQL Python. \
 \
This is a library to allow the easy creation of Relay-compliant servers using \
the GraphQL Python reference implementation of a GraphQL server."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python311-graphql-relay-3.2.0-2.1.noarch.rpm"
RPM_HASH = "08d429fc0cac59cfd8b682a67b40ed3c96e88ba49deb0a2162bace0be47bb809f548dd755cf31e9a1018888b647d70a69b161fe1d716435be10fece98f2c430c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-graphql-relay \
python3.11dist-graphql-relay \
python311-graphql-relay \
python3dist-graphql-relay"

RDEPENDS:${PN} += "-python311-graphql-core >= 3.2 \
python-abi \
python311-promise"

inherit rpm
