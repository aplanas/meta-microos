SUMMARY = "Django module to process multiple Celery task requests together"
DESCRIPTION = "An alternate way to have Django DRY forms. The developer can build \
programmatic reusable layouts out of components, having control of \
the rendered HTML without writing HTML in templates, without breaking \
the standard way of doing things in Django, so that it still works \
with any other form application."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python39-celery-batches-0.7-1.2.noarch.rpm"
RPM_HASH = "8682a339b881c3249babe58df5a74b7b5c1c463ac8fac7a11716a281ec0592294d1415c046252a40980d91e9894545408166321ebc557039dfc75b926d87701a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-celery-batches \
python39-celery-batches \
python3dist-celery-batches"

RDEPENDS:${PN} += "python-abi \
python39-celery"

inherit rpm
