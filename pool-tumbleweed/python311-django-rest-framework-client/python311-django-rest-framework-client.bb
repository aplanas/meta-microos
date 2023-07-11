SUMMARY = "Python client for a Django REST Framework based web site"
DESCRIPTION = "Python client for a Django REST Framework based web site."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-django-rest-framework-client-0.1.1-4.8.noarch.rpm"
RPM_HASH = "3face70ea73df150d4435d75e6cb12205f43b720bd055c71360478518530862984cd5839bbf48809a3e9143ea3e64c51f9f8d50f0f9be6248421afc351d5e7ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-framework-client \
python3.11dist-django-rest-framework-client \
python311-django-rest-framework-client \
python3dist-django-rest-framework-client"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-requests"

inherit rpm
