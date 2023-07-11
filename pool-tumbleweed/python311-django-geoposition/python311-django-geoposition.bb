SUMMARY = "Django model field that can hold a geoposition"
DESCRIPTION = "Django model field that can hold a geoposition, and corresponding admin widget."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-django-geoposition-0.3.0-2.9.noarch.rpm"
RPM_HASH = "e876c15f7310697fc0c09702bcec4a38057b1624f7d9b13d09cce9dd81cd9df3927b5f32873bb34940d2aff1beac682ef832bcec4e12e3ef4ca47858d781e856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-geoposition \
python3.11dist-django-geoposition \
python311-django-geoposition \
python3dist-django-geoposition"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
