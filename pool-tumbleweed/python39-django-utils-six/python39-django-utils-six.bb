SUMMARY = "Forward compatibility django.utils.six for Django 3"
DESCRIPTION = "Forward compatibility django.utils.six for Django 3."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python39-django-utils-six-2.0-1.13.noarch.rpm"
RPM_HASH = "4b3fe608356682b354a4225a1bd1f94ad4630fe519e1a3acef1694807b2c5b91305f8a69a07b753c9419438348f966d79c957de5cfec6af8c70a3813c9835e8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-utils-six \
python39-django-utils-six \
python3dist-django-utils-six"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
