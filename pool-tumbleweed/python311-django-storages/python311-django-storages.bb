SUMMARY = "Support for many storage backends in Django"
DESCRIPTION = "django-storages is a project to provide a variety of storage backends in a single library."
LICENSE = "BSD-3-Clause"

PV = "1.13.2"

RPM_NAME = "python311-django-storages-1.13.2-1.5.noarch.rpm"
RPM_HASH = "28d5217316b22eefbd818573b8e0241d324e0fc93225a9efb7c707002f71742c300143faf67fab0e4bf3c185074f7f3e850292e61ea04961154e500e4744d599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-storages \
python3.11dist-django-storages \
python311-django-storages \
python3dist-django-storages"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
