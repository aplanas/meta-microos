SUMMARY = "GraphQL Framework for Python"
DESCRIPTION = "Graphene is a Python library for building GraphQL schemas/types."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python310-graphene-3.2.1-2.2.noarch.rpm"
RPM_HASH = "ee9fcc8fd5169e1659e4c7e9754a7fcb24ea19ac17becab70e2eb9867c5464fb367b4dc6b48ef2e755fa67a81353fa0fb1061fb99d56cd59e905e9c071f48f0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-graphene \
python3.10dist-graphene \
python310-graphene \
python3dist-graphene"

RDEPENDS:${PN} += "python-abi \
python310-aniso8601 \
python310-graphql-core \
python310-graphql-relay"

inherit rpm
