SUMMARY = "Django statistics app"
DESCRIPTION = "django-request is a statistics module for django. \
It stores requests in a database for admins to see, \
it can also be used to get statistics on who is online etc."
LICENSE = "BSD-2-Clause"

PV = "1.6.3"

RPM_NAME = "python39-django-request-1.6.3-1.1.noarch.rpm"
RPM_HASH = "5dd12adc344e9b9ce582326e51d409571f5248219ef0ab1dc77905aa28fd413d6583f2fdd21649880e2247d5cec22873d5744ea3f9069557078edfe2652e141c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-request \
python39-django-request \
python3dist-django-request"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-python-dateutil"

inherit rpm
