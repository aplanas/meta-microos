SUMMARY = "Graphene Django integration"
DESCRIPTION = "Graphene Django integration."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-graphene-django-3.0.0-1.7.noarch.rpm"
RPM_HASH = "212dbfbb8a1880520a52d8d6ec8a73071f850d2cf88c95127e4db3565de3ca3dd3eef44078b55646efea517f659d2beecddfbdecfec428dd3e88a307f6894755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-graphene-django \
python3.11dist-graphene-django \
python311-graphene-django \
python3dist-graphene-django"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-graphene \
python311-graphql-core \
python311-graphql-relay \
python311-promise \
python311-six \
python311-text-unidecode"

inherit rpm
