SUMMARY = "Django DRY Forms"
DESCRIPTION = "A module to build programmatic reusable layouts out of components \
with control over the rendered HTML without writing HTML in \
templates, and without breaking the standard way of doing things in \
Django."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python39-django-crispy-forms-1.14.0-1.5.noarch.rpm"
RPM_HASH = "9171c874eba91058627f27406c3dbc9aa3e47fabf46dcd6097c48100d8f4fdfdcdd7ec0644ce0930d22312e51280b0be2950029e069fbddde73f68576c29bc7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-crispy-forms \
python39-django-crispy-forms \
python3dist-django-crispy-forms"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
