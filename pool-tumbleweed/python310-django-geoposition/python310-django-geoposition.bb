SUMMARY = "Django model field that can hold a geoposition"
DESCRIPTION = "Django model field that can hold a geoposition, and corresponding admin widget."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-django-geoposition-0.3.0-2.9.noarch.rpm"
RPM_HASH = "745e05322cb07b6983c8fbcb0f0f3f038656f36ba49ea8807c2dc0a1bb56486ae73823fb5a009e308ff7e0ebade3af8a9be48fd27f07cc89d385401cd1677ca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-geoposition \
python310-django-geoposition \
python3dist-django-geoposition"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
