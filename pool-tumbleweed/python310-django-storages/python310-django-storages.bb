SUMMARY = "Support for many storage backends in Django"
DESCRIPTION = "django-storages is a project to provide a variety of storage backends in a single library."
LICENSE = "BSD-3-Clause"

PV = "1.13.2"

RPM_NAME = "python310-django-storages-1.13.2-1.5.noarch.rpm"
RPM_HASH = "3916ce27b83a54a56057cf58fc7133e2f067fb0616f4495e174f1fb00194560673f6ef3f57f388248d6149952d170721b83e9be7f608ef768920b515c24720bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-storages \
python310-django-storages \
python3dist-django-storages"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
