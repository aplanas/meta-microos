SUMMARY = "Django support for using money and currency fields"
DESCRIPTION = "Django money and currency fields in models and forms."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python310-django-money-3.0-1.3.noarch.rpm"
RPM_HASH = "efe26f9fb643d9d8a4886939036340f65f7e53fe7af3669e45ba1f0ee7ff7a3ff72b55eb25db1e6f6ce86426de1617bb58c2d21ba3208c8c40d6f070fa87ac94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-money \
python3.10dist(django-money) \
python310-django-money \
python3dist(django-money)"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-py-moneyed \
python310-setuptools"

inherit rpm
