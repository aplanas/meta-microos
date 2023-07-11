SUMMARY = "Table/data-grid framework for Django"
DESCRIPTION = "Simplifies the task of turning sets of data into HTML tables. It has native \
support for pagination and sorting. It does for HTML tables what django.forms \
does for HTML forms."
LICENSE = "BSD-2-Clause"

PV = "2.6.0"

RPM_NAME = "python39-django-tables2-2.6.0-1.1.noarch.rpm"
RPM_HASH = "6d5aa8ff9d635ae05969c51f9f4ff6eae07ca379d933a2862eb1caf0b4a2138f8d48f863da088cca84dd22ed2606fcc7ca1efa323ee87a3d1df23221617aa24a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-tables2 \
python39-django-tables2 \
python3dist-django-tables2"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
