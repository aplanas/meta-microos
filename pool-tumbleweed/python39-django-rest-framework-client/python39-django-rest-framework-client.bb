SUMMARY = "Python client for a Django REST Framework based web site"
DESCRIPTION = "Python client for a Django REST Framework based web site."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-django-rest-framework-client-0.1.1-4.8.noarch.rpm"
RPM_HASH = "7f337dd885e4b0bd79368d7badb2301f29c83634ec311e61dd9609800f76cd27cd4f85f48a8c7ca9bc352cd4c42025304cd9c0ceb8f375161b3ee9a35acbd66f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-rest-framework-client \
python39-django-rest-framework-client \
python3dist-django-rest-framework-client"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-requests"

inherit rpm
