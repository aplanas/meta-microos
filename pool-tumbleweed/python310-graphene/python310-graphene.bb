SUMMARY = "GraphQL Framework for Python"
DESCRIPTION = "Graphene is a Python library for building GraphQL schemas/types."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python310-graphene-3.2.1-2.4.noarch.rpm"
RPM_HASH = "cabbc3fac98b75ab65bca786b9e33d1624f26eae99b980de81237fb6e6a90d6916e504cb13e7f86ce9afbbab64dadedb2e99f22cbb393b4920d7446ab9315e8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-graphene \
python310-graphene \
python3dist-graphene"

RDEPENDS:${PN} += "python-abi \
python310-aniso8601 \
python310-graphql-core \
python310-graphql-relay"

inherit rpm
