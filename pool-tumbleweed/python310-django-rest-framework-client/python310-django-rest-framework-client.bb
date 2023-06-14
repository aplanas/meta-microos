SUMMARY = "Python client for a Django REST Framework based web site"
DESCRIPTION = "Python client for a Django REST Framework based web site."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-django-rest-framework-client-0.1.1-4.6.noarch.rpm"
RPM_HASH = "86b729b0146d0fc230f608b8550c3c7126c8b6129c3c0c4d6b323a07e65353a0ff8e8108103c0f30c57ca4112b7d82d405927bf74dde27f8de8c4ee9963893a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-framework-client \
python3.10dist-django-rest-framework-client \
python310-django-rest-framework-client \
python3dist-django-rest-framework-client"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-requests"

inherit rpm
