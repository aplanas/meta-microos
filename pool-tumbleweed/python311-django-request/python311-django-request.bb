SUMMARY = "Django statistics app"
DESCRIPTION = "django-request is a statistics module for django. \
It stores requests in a database for admins to see, \
it can also be used to get statistics on who is online etc."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "python311-django-request-1.6.2-1.6.noarch.rpm"
RPM_HASH = "a62491369e14ae2e7dccba6938c563ef288b01db58d4494d0b6b1e29cf08a23ff7c548180eac28ef85e38ddd2051a8352696a5adfa828480b17f0f33d3ada039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-request \
python3.11dist-django-request \
python311-django-request \
python3dist-django-request"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-python-dateutil"

inherit rpm
