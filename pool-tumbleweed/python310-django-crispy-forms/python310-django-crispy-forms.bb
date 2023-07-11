SUMMARY = "Django DRY Forms"
DESCRIPTION = "A module to build programmatic reusable layouts out of components \
with control over the rendered HTML without writing HTML in \
templates, and without breaking the standard way of doing things in \
Django."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python310-django-crispy-forms-1.14.0-1.5.noarch.rpm"
RPM_HASH = "07ea73712803bb6fb26c839354077d593aad2ae988270e4a50f38306f0e9640397be203fa6f69ca10e7bdb63feff5eda02858f36025782a464dd7b300876b28e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-crispy-forms \
python310-django-crispy-forms \
python3dist-django-crispy-forms"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
