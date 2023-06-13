SUMMARY = "Reusable Django app to allow users to filter queryset dynamically"
DESCRIPTION = "Django-filter is a reusable Django application for allowing users to filter queryset dynamically. \
For usage and installation instructions, consult the docs directory."
LICENSE = "BSD-3-Clause"

PV = "23.1"

RPM_NAME = "python39-django-filter-23.1-1.2.noarch.rpm"
RPM_HASH = "2c2a681eda08ff6a84a6423069302604ea74338b06779a6c282f06bd3f720b0cbc9a1d6abdb3f0db4cb5ba85b7ebb6c5db44af8f66de23144f0130e894c62a21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-filter) \
python39-django-filter \
python3dist(django-filter)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-djangorestframework"

inherit rpm
