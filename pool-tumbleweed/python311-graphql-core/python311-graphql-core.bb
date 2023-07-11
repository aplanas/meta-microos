SUMMARY = "GraphQL implementation for Python"
DESCRIPTION = "GraphQL implementation for Python, a port of GraphQL.js, \
the JavaScript reference implementation for GraphQL."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "python311-graphql-core-3.2.3-2.2.noarch.rpm"
RPM_HASH = "be5d4252235dcb8637195018a393c198a92a767e35fb10cc282420483f3ad2dfd7266b13bf0cc1f1d35f44277242620745fb42164c70b2098dadfb3d1b42bf30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-graphql-core \
python3.11dist-graphql-core \
python311-graphql-core \
python3dist-graphql-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
