SUMMARY = "Reusable Django app to allow users to filter queryset dynamically"
DESCRIPTION = "Django-filter is a reusable Django application for allowing users to filter queryset dynamically. \
For usage and installation instructions, consult the docs directory."
LICENSE = "BSD-3-Clause"

PV = "23.1"

RPM_NAME = "python311-django-filter-23.1-1.2.noarch.rpm"
RPM_HASH = "3615b03e0fa080bf32815249783b7bcc88598fecb36ceacc21f0472251ad9ac32e943f98558e40c6d9194c7814e7583dc9e88497e1fc2a1a41f227d663bac86b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-filter \
python311-django-filter \
python3dist-django-filter"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-djangorestframework"

inherit rpm
