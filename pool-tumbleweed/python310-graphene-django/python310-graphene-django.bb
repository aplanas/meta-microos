SUMMARY = "Graphene Django integration"
DESCRIPTION = "Graphene Django integration."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-graphene-django-3.0.0-1.7.noarch.rpm"
RPM_HASH = "a2abb725a6517adf7d9b317683129b9d872c829d57afc11a653475bff4014909216c1c6c6385ab0242bd9fb69eb17f3b469259f2e2daab2793f46f813c4250d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-graphene-django \
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
