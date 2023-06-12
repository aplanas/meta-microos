SUMMARY = "Python client for a Django REST Framework based web site"
DESCRIPTION = "Python client for a Django REST Framework based web site."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-django-rest-framework-client-0.1.1-4.6.noarch.rpm"
RPM_HASH = "433d3d1f4ea0e2c7f6e604e8d74c30f4cbef0ba87d23a231cff99325493591ac879de2abfd9fba8c71d5f40b0d8709d642ccf9973f6684a316c052f2c7b6e845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-rest-framework-client) \
python311-django-rest-framework-client \
python3dist(django-rest-framework-client)"
RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-requests"

inherit rpm
