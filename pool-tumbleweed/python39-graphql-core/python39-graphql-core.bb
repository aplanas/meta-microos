SUMMARY = "GraphQL implementation for Python"
DESCRIPTION = "GraphQL implementation for Python, a port of GraphQL.js, \
the JavaScript reference implementation for GraphQL."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "python39-graphql-core-3.2.3-2.2.noarch.rpm"
RPM_HASH = "dc9b46990ebfd125cd3f01fee87972f0e0263f3472e24c72af2e4e167b3e3fe97c5de46ff0a390c151c9509b936027219d1ba813276a5120df4a62ea20e6e6bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-graphql-core \
python39-graphql-core \
python3dist-graphql-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
