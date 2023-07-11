SUMMARY = "Django support for using money and currency fields"
DESCRIPTION = "Django money and currency fields in models and forms."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python310-django-money-3.0-1.5.noarch.rpm"
RPM_HASH = "da3b6b696aa4d67e4acb14e3b08b793cc9a1f3fd09d5c1628b636d98cad33af2f17980b412d099e03a1ecc2ac99fd00b093234d6fdb24618e07409f7260c1699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-money \
python310-django-money \
python3dist-django-money"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-py-moneyed \
python310-setuptools"

inherit rpm
