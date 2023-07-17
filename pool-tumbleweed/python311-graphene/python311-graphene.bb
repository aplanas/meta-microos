SUMMARY = "GraphQL Framework for Python"
DESCRIPTION = "Graphene is a Python library for building GraphQL schemas/types."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python311-graphene-3.2.1-3.1.noarch.rpm"
RPM_HASH = "a93523586993a389144a34fc26adfe2bb32dc61ec65c65549e4d67bba750ba662398622bd8b4b32d214fd8dcfefc1caa71ccc09b1e8eb86305d2e3256ca0dc81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-graphene \
python3.11dist-graphene \
python311-graphene \
python3dist-graphene"

RDEPENDS:${PN} += "python-abi \
python311-aniso8601 \
python311-graphql-core \
python311-graphql-relay"

inherit rpm
