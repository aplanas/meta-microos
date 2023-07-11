SUMMARY = "Graphene Django integration"
DESCRIPTION = "Graphene Django integration."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-graphene-django-3.0.0-1.7.noarch.rpm"
RPM_HASH = "56dd25d524d7091c3670955a5544200af2a6da9f10e9d54856294cfb8bcb62b86756e1e29e67f3ed181a0b823ba3c5302964ebf62dfe5a9c76fd0e48b5685781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-graphene-django \
python39-graphene-django \
python3dist-graphene-django"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-graphene \
python39-graphql-core \
python39-graphql-relay \
python39-promise \
python39-six \
python39-text-unidecode"

inherit rpm
