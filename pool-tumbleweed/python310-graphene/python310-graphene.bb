SUMMARY = "GraphQL Framework for Python"
DESCRIPTION = "Graphene is a Python library for building GraphQL schemas/types."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python310-graphene-3.2.1-3.1.noarch.rpm"
RPM_HASH = "833c47faefa35ffa6bad72fc06d2356543fc282f7bce163ff64aaeff9c7358b868a8c31a97889483cbf99e59c2ec23d633fd119659bb6ca57d37c634e2227c32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-graphene \
python310-graphene \
python3dist-graphene"

RDEPENDS:${PN} += "python-abi \
python310-aniso8601 \
python310-graphql-core \
python310-graphql-relay"

inherit rpm
