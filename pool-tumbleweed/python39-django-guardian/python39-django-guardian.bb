SUMMARY = "Implementation of per object permissions for Django"
DESCRIPTION = "django-guardian is implementation of per object permissions as \
authorization backend."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python39-django-guardian-2.4.0-4.1.noarch.rpm"
RPM_HASH = "c3272fab224e10c9af1ee72e07c5f041174a9d2a8f095c633a90bbc9b1d9c3e0b5ba7f073dba0c189eded2add08d3bfa4ceada18b8eb0bf76f01cd1e4fab7125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-guardian \
python39-django-guardian \
python3dist-django-guardian"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
