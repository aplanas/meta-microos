SUMMARY = "Forward compatibility django.utils.six for Django 3"
DESCRIPTION = "Forward compatibility django.utils.six for Django 3."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python39-django-utils-six-2.0-1.11.noarch.rpm"
RPM_HASH = "8ac1506ce7af6351f7b179f231f9f77cc042af8d2a7d7946bbc824cc6e68dd24699d08efc8ea6ed7ca76fd36c5013a6a78413565f1fb9b49b0b33f962c84bd5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-utils-six \
python39-django-utils-six \
python3dist-django-utils-six"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
