SUMMARY = "Django statistics app"
DESCRIPTION = "django-request is a statistics module for django. \
It stores requests in a database for admins to see, \
it can also be used to get statistics on who is online etc."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "python39-django-request-1.6.2-1.6.noarch.rpm"
RPM_HASH = "aa5045e5776c4d95cca651bce5bd5873982afd26afad9cbb50597b4c45a4035ae430c9c7e72191f17a6e074cfe27adc570dfbd6a7b95d054216202daf726e053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-request \
python39-django-request \
python3dist-django-request"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-python-dateutil"

inherit rpm
