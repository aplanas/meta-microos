SUMMARY = "Django support for using money and currency fields"
DESCRIPTION = "Django money and currency fields in models and forms."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python311-django-money-3.0-1.5.noarch.rpm"
RPM_HASH = "b049eb7240d80646a60104cd8605766331fbcda5829f091068e016ec2616e197a10dda9a37f743db6f4f8606609cfd0ab63e3305f92c567095e2286886168273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-money \
python3.11dist-django-money \
python311-django-money \
python3dist-django-money"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-py-moneyed \
python311-setuptools"

inherit rpm
