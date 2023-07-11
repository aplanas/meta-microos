SUMMARY = "Extra class-based views for Django"
DESCRIPTION = "Extra class-based views for Django."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python310-django-extra-views-0.14.0-3.5.noarch.rpm"
RPM_HASH = "88b9752368c0800cea056fcb292a688121c060bf0bfd1ed9989888a3edab553df83afee33626fa3595da2f588c892c9718b4a7e153cbb176084bc40203c1fbad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-extra-views \
python310-django-extra-views \
python3dist-django-extra-views"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
