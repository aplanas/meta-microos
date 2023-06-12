SUMMARY = "Support for many storage backends in Django"
DESCRIPTION = "django-storages is a project to provide a variety of storage backends in a single library."
LICENSE = "BSD-3-Clause"

PV = "1.13.2"

RPM_NAME = "python310-django-storages-1.13.2-1.3.noarch.rpm"
RPM_HASH = "0a99e1c44ae9cee5ba0093fdad70db0e406dbb6a13306bfee4ad3d163f3529aefa77aff394d5bb283a59e0120e35edf1f6c68be1dd910df0bb3d136410ab2835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-storages \
python3.10dist(django-storages) \
python310-django-storages \
python3dist(django-storages)"
RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
