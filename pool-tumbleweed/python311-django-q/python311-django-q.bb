SUMMARY = "Multiprocessing Distributed Task Queue for Django"
DESCRIPTION = "This package provides a multiprocessing distributed task queue for Django."
LICENSE = "MIT"

PV = "1.3.9"

RPM_NAME = "python311-django-q-1.3.9-4.1.noarch.rpm"
RPM_HASH = "0a43c5e43b899d0104f845954b01ecda3ae09de2ce715e93ab1c781bcef48af9a4eda9ce13cc6759a00d9691b611fa8bbb1e10eb4a53b9fbcac5b31cb4bc44dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-q \
python3.11dist-django-q \
python311-django-q \
python3dist-django-q"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-arrow \
python311-blessed \
python311-django-picklefield \
python311-redis"

inherit rpm
