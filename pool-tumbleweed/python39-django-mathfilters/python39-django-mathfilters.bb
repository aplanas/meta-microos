SUMMARY = "Django math filters"
DESCRIPTION = "A set of math filters for Django."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-django-mathfilters-1.0.0-2.8.noarch.rpm"
RPM_HASH = "f085b79fe638841247fa1b41d25de13e3ef73d6c76bf459b18904fbc0101d3cfeea59d0f78fcb7f99fea3d99733cf8710b826945d0cb1a9cd02e90ea825376d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-mathfilters \
python39-django-mathfilters \
python3dist-django-mathfilters"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
