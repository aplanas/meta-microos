SUMMARY = "Django module to process multiple Celery task requests together"
DESCRIPTION = "An alternate way to have Django DRY forms. The developer can build \
programmatic reusable layouts out of components, having control of \
the rendered HTML without writing HTML in templates, without breaking \
the standard way of doing things in Django, so that it still works \
with any other form application."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python310-celery-batches-0.8.1-1.1.noarch.rpm"
RPM_HASH = "b831afd429cea8ed84ea54ad7ce015979b98bbf919e99b2d5b419c4418a4e166c3a24ed79b9f5280e804c4fe72fdc172bf89b87958009350f6c49feb1fe5ce3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-celery-batches \
python310-celery-batches \
python3dist-celery-batches"

RDEPENDS:${PN} += "python-abi \
python310-celery"

inherit rpm
