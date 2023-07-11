SUMMARY = "Reusable Django app to allow users to filter queryset dynamically"
DESCRIPTION = "Django-filter is a reusable Django application for allowing users to filter queryset dynamically. \
For usage and installation instructions, consult the docs directory."
LICENSE = "BSD-3-Clause"

PV = "23.1"

RPM_NAME = "python311-django-filter-23.1-1.4.noarch.rpm"
RPM_HASH = "5bb8678519dec5ea813c72ba8cafb03ae0159ca2296be1daa963d5735dc3b5e4054ccbd51728675fb133a05de6144deb8a120d964aa3ea4160bc2a952042dd0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-filter \
python3.11dist-django-filter \
python311-django-filter \
python3dist-django-filter"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-djangorestframework"

inherit rpm
