SUMMARY = "Multiprocessing Distributed Task Queue for Django"
DESCRIPTION = "This package provides a multiprocessing distributed task queue for Django."
LICENSE = "MIT"

PV = "1.3.9"

RPM_NAME = "python39-django-q-1.3.9-4.1.noarch.rpm"
RPM_HASH = "a1dc8f23ef0e463828315376e2fbce4fec087864573be55799a5740c0cbc22b7e16ca5dfc867be05047f806739e942d4f8a832cd13cd7321dd48c363558ac42f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-q \
python39-django-q \
python3dist-django-q"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-arrow \
python39-blessed \
python39-django-picklefield \
python39-redis"

inherit rpm
