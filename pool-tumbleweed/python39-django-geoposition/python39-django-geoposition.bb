SUMMARY = "Django model field that can hold a geoposition"
DESCRIPTION = "Django model field that can hold a geoposition, and corresponding admin widget."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-django-geoposition-0.3.0-2.7.noarch.rpm"
RPM_HASH = "224a4e2dff478eec732cb332be7eec25cf84fe7cde5c8f6ced6cc2a51293df266215fa85bcf2e4cb6410651b28dccb28a67e10c3b2b72efabc7b18a6272fbad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-geoposition) \
python39-django-geoposition \
python3dist(django-geoposition)"

RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
