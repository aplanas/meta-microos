SUMMARY = "Django module to process multiple Celery task requests together"
DESCRIPTION = "An alternate way to have Django DRY forms. The developer can build \
programmatic reusable layouts out of components, having control of \
the rendered HTML without writing HTML in templates, without breaking \
the standard way of doing things in Django, so that it still works \
with any other form application."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python311-celery-batches-0.7-1.4.noarch.rpm"
RPM_HASH = "68e436c0a3a38724603f66940f5570b925143c10d5774be9bc4e1fa54fc53edee890f1bf110305b7577926af7c5b2707e97e37b8abdcf26d2d85902f293e4af0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-celery-batches \
python3.11dist-celery-batches \
python311-celery-batches \
python3dist-celery-batches"

RDEPENDS:${PN} += "python-abi \
python311-celery"

inherit rpm
