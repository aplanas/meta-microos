SUMMARY = "Extra class-based views for Django"
DESCRIPTION = "Extra class-based views for Django."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python39-django-extra-views-0.14.0-3.5.noarch.rpm"
RPM_HASH = "c31c43cfb0cda709a72011e59071b550bdfea81dd0fcb5abbb67998610b63f7cbb854ed0d5e6f9419c240f21b0df87c40574e28f9e278f308fc86f8ca99566f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-extra-views \
python39-django-extra-views \
python3dist-django-extra-views"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
