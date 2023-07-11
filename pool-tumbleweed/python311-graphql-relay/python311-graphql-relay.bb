SUMMARY = "Relay implementation for Python"
DESCRIPTION = "Relay Library for GraphQL Python. \
 \
This is a library to allow the easy creation of Relay-compliant servers using \
the GraphQL Python reference implementation of a GraphQL server."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python311-graphql-relay-3.2.0-1.6.noarch.rpm"
RPM_HASH = "fd12ece9321a7a6d49b8a65406e4a7a633046960d6b5c846ab50e97c09a1ec2d37c642f638cfed474e94b6cc01fe08292f587806365aa04d4e028b6d8135144d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-graphql-relay \
python3.11dist-graphql-relay \
python311-graphql-relay \
python3dist-graphql-relay"

RDEPENDS:${PN} += "-python311-graphql-core >= 3.2 \
python-abi \
python311-promise"

inherit rpm
