SUMMARY = "Django DRY Forms"
DESCRIPTION = "A module to build programmatic reusable layouts out of components \
with control over the rendered HTML without writing HTML in \
templates, and without breaking the standard way of doing things in \
Django."
LICENSE = "MIT"

PV = "2.0"

RPM_NAME = "python310-django-crispy-forms-2.0-1.1.noarch.rpm"
RPM_HASH = "ec958aa472a785e8e3e7e85e096fa4dfb4b228061c00aeb85cdbcc3fb13a7c3b5c4b4e7117ff3610b5254f1c3196ba75f36ebbd1290ad6befe660c61a2742243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-crispy-forms \
python310-django-crispy-forms \
python3dist-django-crispy-forms"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
