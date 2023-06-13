SUMMARY = "Graphene Django integration"
DESCRIPTION = "Graphene Django integration."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-graphene-django-3.0.0-1.4.noarch.rpm"
RPM_HASH = "7f7bbdf1d2f3ac17c8a5b08687002a695560cac6dedbb6d75b4c7caddb489cb0f047c4f0ea55593a01ee3cdcb77ef3fb7ea8bea36f3f5f2ea2eba695d956017f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(graphene-django) \
python39-graphene-django \
python3dist(graphene-django)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-graphene \
python39-graphql-core \
python39-graphql-relay \
python39-promise \
python39-six \
python39-text-unidecode"

inherit rpm
