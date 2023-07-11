SUMMARY = "GraphQL Framework for Python"
DESCRIPTION = "Graphene is a Python library for building GraphQL schemas/types."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python39-graphene-3.2.1-2.4.noarch.rpm"
RPM_HASH = "fbfa0f79d846f08d1e53941b007b0f6dc1bc678b86788946de70204c73494d5866a4a35933970e1223b6fca9bb593df8b22e29085f315d9821ddc65ec879df34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-graphene \
python39-graphene \
python3dist-graphene"

RDEPENDS:${PN} += "python-abi \
python39-aniso8601 \
python39-graphql-core \
python39-graphql-relay"

inherit rpm
