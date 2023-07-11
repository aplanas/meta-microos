SUMMARY = "Table/data-grid framework for Django"
DESCRIPTION = "Simplifies the task of turning sets of data into HTML tables. It has native \
support for pagination and sorting. It does for HTML tables what django.forms \
does for HTML forms."
LICENSE = "BSD-2-Clause"

PV = "2.6.0"

RPM_NAME = "python310-django-tables2-2.6.0-1.1.noarch.rpm"
RPM_HASH = "75bc06c0e9accfac799753310b64b5bff59d3ccbaa52c330d68a45223de4fcbd7e2aca26fee0f4ebf38217ab51bace7a80e375f0da3c383d58a7a6d639d0a8f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-tables2 \
python310-django-tables2 \
python3dist-django-tables2"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
