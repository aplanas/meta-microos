SUMMARY = "Multiprocessing Distributed Task Queue for Django"
DESCRIPTION = "This package provides a multiprocessing distributed task queue for Django."
LICENSE = "MIT"

PV = "1.3.9"

RPM_NAME = "python310-django-q-1.3.9-4.1.noarch.rpm"
RPM_HASH = "e1eee9c0017a2c0340b53b4d84d4727fe0d2cf3ddd3846be3e18b725c286b33f095b327e7662049e8b97bf1547efb679c62e8d944795cb6cdb7d4701b19c224a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-q \
python310-django-q \
python3dist-django-q"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-arrow \
python310-blessed \
python310-django-picklefield \
python310-redis"

inherit rpm
