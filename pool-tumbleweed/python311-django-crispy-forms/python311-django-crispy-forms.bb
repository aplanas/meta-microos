SUMMARY = "Django DRY Forms"
DESCRIPTION = "A module to build programmatic reusable layouts out of components \
with control over the rendered HTML without writing HTML in \
templates, and without breaking the standard way of doing things in \
Django."
LICENSE = "MIT"

PV = "2.0"

RPM_NAME = "python311-django-crispy-forms-2.0-1.1.noarch.rpm"
RPM_HASH = "232c380d02cd2742abf25d0ff8d210297f8d84beac2ff1a53982e34e83405b60f75b5c4e6846b44f412d2e6e6dfd2a4c2df26ce35cb605a76ff2e0e53ace43bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-crispy-forms \
python3.11dist-django-crispy-forms \
python311-django-crispy-forms \
python3dist-django-crispy-forms"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
