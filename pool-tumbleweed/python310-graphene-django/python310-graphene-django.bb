SUMMARY = "Graphene Django integration"
DESCRIPTION = "Graphene Django integration."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-graphene-django-3.0.0-1.4.noarch.rpm"
RPM_HASH = "cb16f67d96f6442f8d65591f96e6cdead53c2dbc8fb867f697c98f96c14db03a73874f07a3914891856520486ddc7f6f6fde9a43392c6ce73fa404037e12fe95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-graphene-django \
python3.10dist-graphene-django \
python310-graphene-django \
python3dist-graphene-django"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-graphene \
python310-graphql-core \
python310-graphql-relay \
python310-promise \
python310-six \
python310-text-unidecode"

inherit rpm
