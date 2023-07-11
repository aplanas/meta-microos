SUMMARY = "Reusable Django app to allow users to filter queryset dynamically"
DESCRIPTION = "Django-filter is a reusable Django application for allowing users to filter queryset dynamically. \
For usage and installation instructions, consult the docs directory."
LICENSE = "BSD-3-Clause"

PV = "23.1"

RPM_NAME = "python310-django-filter-23.1-1.4.noarch.rpm"
RPM_HASH = "c006ceed1f83649e37ec4c6807144918a07c4d19436c1bee4088e1a2b9820877d489cd58eb4c9fdb6f85dd53620670a50a3965730b00c5dc67e275ea389943d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-filter \
python310-django-filter \
python3dist-django-filter"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-djangorestframework"

inherit rpm
