SUMMARY = "Support for many storage backends in Django"
DESCRIPTION = "django-storages is a project to provide a variety of storage backends in a single library."
LICENSE = "BSD-3-Clause"

PV = "1.13.2"

RPM_NAME = "python39-django-storages-1.13.2-1.5.noarch.rpm"
RPM_HASH = "3083dc4c0e6b1cb4ec998d8d78dfc4b400b0fc30f628b359ca612f9bf9f658b908c6e6b622e9c0a66d9324280b79f95998b38538ce8c41d941af128f3da08eae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-storages \
python39-django-storages \
python3dist-django-storages"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
