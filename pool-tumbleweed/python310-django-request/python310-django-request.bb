SUMMARY = "Django statistics app"
DESCRIPTION = "django-request is a statistics module for django. \
It stores requests in a database for admins to see, \
it can also be used to get statistics on who is online etc."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "python310-django-request-1.6.2-1.4.noarch.rpm"
RPM_HASH = "55550a6007a4672f1b017ac8cf83ee47f4ff9e4a8b9633acb7d5d81c8e97fa2b458a641faffc65266d858d6b377dd4778be5079be5bc5fa940791fbebcecad71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-request \
python3.10dist(django-request) \
python310-django-request \
python3dist(django-request)"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-python-dateutil"

inherit rpm
