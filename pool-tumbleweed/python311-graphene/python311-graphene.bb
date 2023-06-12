SUMMARY = "GraphQL Framework for Python"
DESCRIPTION = "Graphene is a Python library for building GraphQL schemas/types."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python311-graphene-3.2.1-2.2.noarch.rpm"
RPM_HASH = "e0836c48c7ca6db02b06441021868abd7d52174e4b738c992bebcfba99eb68eced2a0ed5a514d9be3bd34717b7384e08d8b19493212b3833f22393e63acae96d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(graphene) \
python311-graphene \
python3dist(graphene)"
RDEPENDS:${PN} += "python(abi) \
python311-aniso8601 \
python311-graphql-core \
python311-graphql-relay"

inherit rpm
