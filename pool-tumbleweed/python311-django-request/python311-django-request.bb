SUMMARY = "Django statistics app"
DESCRIPTION = "django-request is a statistics module for django. \
It stores requests in a database for admins to see, \
it can also be used to get statistics on who is online etc."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "python311-django-request-1.6.2-1.4.noarch.rpm"
RPM_HASH = "695cc1e1d912b8a6203282ab497da724b33fd1ed076b1b26bfd59af354ae29696c8fbf0142841f04f174e319b0345ad5eb52c8fc8ab866777ffe010f2444f6c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-request) \
python311-django-request \
python3dist(django-request)"

RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-python-dateutil"

inherit rpm
