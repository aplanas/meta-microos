SUMMARY = "Django statistics app"
DESCRIPTION = "django-request is a statistics module for django. \
It stores requests in a database for admins to see, \
it can also be used to get statistics on who is online etc."
LICENSE = "BSD-2-Clause"

PV = "1.6.3"

RPM_NAME = "python310-django-request-1.6.3-1.1.noarch.rpm"
RPM_HASH = "839bb01d6fdb977f54447176165cbb86f220e345e11013de2894b7e49110576accf404d5f83a44d33c7c23ca6f4c36c4dbd08c84b351d2239af27c68aad245cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-request \
python310-django-request \
python3dist-django-request"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-python-dateutil"

inherit rpm
