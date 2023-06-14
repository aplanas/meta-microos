SUMMARY = "Django model field that can hold a geoposition"
DESCRIPTION = "Django model field that can hold a geoposition, and corresponding admin widget."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-django-geoposition-0.3.0-2.7.noarch.rpm"
RPM_HASH = "446625716a1f0da5fd1f867d10ca59eeb1549bac85ef68b921eec9ad1ad304c56316773bba765513c26cd59ac09ddc23f61e4d97d99942566136428bd95a0d20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-geoposition \
python311-django-geoposition \
python3dist-django-geoposition"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
