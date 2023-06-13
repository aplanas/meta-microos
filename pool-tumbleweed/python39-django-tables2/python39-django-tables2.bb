SUMMARY = "Table/data-grid framework for Django"
DESCRIPTION = "Simplifies the task of turning sets of data into HTML tables. It has native \
support for pagination and sorting. It does for HTML tables what django.forms \
does for HTML forms."
LICENSE = "BSD-2-Clause"

PV = "2.5.3"

RPM_NAME = "python39-django-tables2-2.5.3-1.1.noarch.rpm"
RPM_HASH = "b2c9752ab69732a9330c02efeeee4d18ace70024a7779a96129128d18c3d9e5629be654a6c73c8fe4ce844d1aad9eaad6f3dcb936df483662585c33605775faa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-tables2) \
python39-django-tables2 \
python3dist(django-tables2)"

RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
