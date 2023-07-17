SUMMARY = "Django statistics app"
DESCRIPTION = "django-request is a statistics module for django. \
It stores requests in a database for admins to see, \
it can also be used to get statistics on who is online etc."
LICENSE = "BSD-2-Clause"

PV = "1.6.3"

RPM_NAME = "python311-django-request-1.6.3-1.1.noarch.rpm"
RPM_HASH = "bce7d60d46133b0ef79dea74186f16d323918efbd7902f8dfe85171133b79422970ca47317b87db00eb68eca1ddd04e1cbbabbaf2e210d20b33233a582b0a609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-request \
python3.11dist-django-request \
python311-django-request \
python3dist-django-request"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-python-dateutil"

inherit rpm
