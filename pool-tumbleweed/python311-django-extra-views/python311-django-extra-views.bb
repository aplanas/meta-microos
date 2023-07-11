SUMMARY = "Extra class-based views for Django"
DESCRIPTION = "Extra class-based views for Django."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python311-django-extra-views-0.14.0-3.5.noarch.rpm"
RPM_HASH = "ea3a5608a4c83b33e623e30c23456c2408f6e4c9fff519635b057d2bec79c8425b8630842ae9396775a2e0e05d899eac15e0565fce7682966da04a09ef93d56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-extra-views \
python3.11dist-django-extra-views \
python311-django-extra-views \
python3dist-django-extra-views"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
