SUMMARY = "Django statistics app"
DESCRIPTION = "django-request is a statistics module for django. \
It stores requests in a database for admins to see, \
it can also be used to get statistics on who is online etc."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "python310-django-request-1.6.2-1.6.noarch.rpm"
RPM_HASH = "d7f6975a6bf689efd5fb31ccc6cc9d36c30a8610d5cd97a868d86d1ebcdf25e448fef1a0ee457027198f1e74205354eca5d81ee9694c49d627962065ec7d8dc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-request \
python310-django-request \
python3dist-django-request"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-python-dateutil"

inherit rpm
