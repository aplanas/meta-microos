SUMMARY = "Django statistics app"
DESCRIPTION = "django-request is a statistics module for django. \
It stores requests in a database for admins to see, \
it can also be used to get statistics on who is online etc."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "python39-django-request-1.6.2-1.4.noarch.rpm"
RPM_HASH = "4eb3e1b8997df0033092c1a6f0536598a1374174517e78103f0817b10bae1ad898211b88b56a455c482e2d9c8ee1f8afe8e7928b8091c904cdcc00a804bcdf22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-request \
python39-django-request \
python3dist-django-request"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-python-dateutil"

inherit rpm
