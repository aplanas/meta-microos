SUMMARY = "Django DRY Forms"
DESCRIPTION = "A module to build programmatic reusable layouts out of components \
with control over the rendered HTML without writing HTML in \
templates, and without breaking the standard way of doing things in \
Django."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python311-django-crispy-forms-1.14.0-1.5.noarch.rpm"
RPM_HASH = "d0c84524f0d679036d9f818a01a2a4095a8dd5fb1800390443e5d0dabfbdef62d4b4f21fd3367f516c0f16682202755155884c108638c72a0818b64aa1c11163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-crispy-forms \
python3.11dist-django-crispy-forms \
python311-django-crispy-forms \
python3dist-django-crispy-forms"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
