SUMMARY = "GraphQL Framework for Python"
DESCRIPTION = "Graphene is a Python library for building GraphQL schemas/types."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python311-graphene-3.2.1-2.4.noarch.rpm"
RPM_HASH = "53e5706e5f7bfdb9057bc7df97bc2dde1534470d6803c40932387e8ecc2021169f6743c0eeebaf3aa01b2c5ba19a5666150e1aaef5f3f452484050cd23c8c813"
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
