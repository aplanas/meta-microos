SUMMARY = "Drop-in replacement for django's many to many field with sorted relations"
DESCRIPTION = "Drop-in replacement for Django's many to many field with sorted relations."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "python310-django-sortedm2m-3.1.1-1.9.noarch.rpm"
RPM_HASH = "36950680f56bf39c6367625efe14202024ca30875e46017c5941c03e4e146299089ca5a05a7c4de7cf45cf647bff540e19c6cf8887d70766f364affafe952f57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-sortedm2m \
python310-django-sortedm2m \
python3dist-django-sortedm2m"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
