SUMMARY = "Reusable Django app to allow users to filter queryset dynamically"
DESCRIPTION = "Django-filter is a reusable Django application for allowing users to filter queryset dynamically. \
For usage and installation instructions, consult the docs directory."
LICENSE = "BSD-3-Clause"

PV = "23.1"

RPM_NAME = "python310-django-filter-23.1-1.2.noarch.rpm"
RPM_HASH = "b408d17e38c1732c7c3c1069c7dde99b61f6cf700e643c691e0fca12ead5ca5c777e43caf4afdb6bfabd09df24fbfc7051a1d5b2bebb7e2b46642b74eccdf1d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-filter \
python3.10dist(django-filter) \
python310-django-filter \
python3dist(django-filter)"

RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-djangorestframework"

inherit rpm
