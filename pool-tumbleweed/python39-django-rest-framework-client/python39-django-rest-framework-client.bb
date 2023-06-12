SUMMARY = "Python client for a Django REST Framework based web site"
DESCRIPTION = "Python client for a Django REST Framework based web site."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-django-rest-framework-client-0.1.1-4.6.noarch.rpm"
RPM_HASH = "dbc850e758e6cbcd26da55d53933aa71b4726130050731100718118132eadbf7625f3206bae5dd4814162191ebba713f1a3951f90969e02294c85862361a3907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-rest-framework-client) \
python39-django-rest-framework-client \
python3dist(django-rest-framework-client)"
RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-requests"

inherit rpm
