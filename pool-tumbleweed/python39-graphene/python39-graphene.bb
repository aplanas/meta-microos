SUMMARY = "GraphQL Framework for Python"
DESCRIPTION = "Graphene is a Python library for building GraphQL schemas/types."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python39-graphene-3.2.1-3.1.noarch.rpm"
RPM_HASH = "8c20ec3bddea27e9ea26d3f2b7e1f4c33e37b4f13de67e1c01b94e14dd3e3b9c8cbe026abf33963d76032ad4a4e0761f48b6d7e82763d57374babb3d41e7d6d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-graphene \
python39-graphene \
python3dist-graphene"

RDEPENDS:${PN} += "python-abi \
python39-aniso8601 \
python39-graphql-core \
python39-graphql-relay"

inherit rpm
