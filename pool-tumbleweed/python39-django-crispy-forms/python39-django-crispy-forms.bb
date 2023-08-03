SUMMARY = "Django DRY Forms"
DESCRIPTION = "A module to build programmatic reusable layouts out of components \
with control over the rendered HTML without writing HTML in \
templates, and without breaking the standard way of doing things in \
Django."
LICENSE = "MIT"

PV = "2.0"

RPM_NAME = "python39-django-crispy-forms-2.0-1.1.noarch.rpm"
RPM_HASH = "ffd6d2c80ce39f9d56ec801fc52b41f829d26995b4d7676553c4912b74e5f9c47e0ca895ac7a8bcd6579bcb0d676ec2ced09e7dc5c5409dd493aaeafa5522559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-crispy-forms \
python39-django-crispy-forms \
python3dist-django-crispy-forms"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
