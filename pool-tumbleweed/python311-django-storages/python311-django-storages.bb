SUMMARY = "Support for many storage backends in Django"
DESCRIPTION = "django-storages is a project to provide a variety of storage backends in a single library."
LICENSE = "BSD-3-Clause"

PV = "1.13.2"

RPM_NAME = "python311-django-storages-1.13.2-1.3.noarch.rpm"
RPM_HASH = "50eca5d7294214b5a88e1a34e4ff425c1c0eaa4d6e6c679264a337d16dd20520617989c9f7ea668d5d1074b1d277e8c07a88ca96929f063fcc2839aaa3122aef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-storages) \
python311-django-storages \
python3dist(django-storages)"
RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
