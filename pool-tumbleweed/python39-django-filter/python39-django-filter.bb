SUMMARY = "Reusable Django app to allow users to filter queryset dynamically"
DESCRIPTION = "Django-filter is a reusable Django application for allowing users to filter queryset dynamically. \
For usage and installation instructions, consult the docs directory."
LICENSE = "BSD-3-Clause"

PV = "23.1"

RPM_NAME = "python39-django-filter-23.1-1.4.noarch.rpm"
RPM_HASH = "eba3d12d337b0a1562c8b3c955a886aa2a29494c3811ceecf4f5f6a48b8f6473564fbcc7ab978b7d8b9b243cf6f571021024377157cd480e7a8eaaee41801817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-filter \
python39-django-filter \
python3dist-django-filter"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-djangorestframework"

inherit rpm
