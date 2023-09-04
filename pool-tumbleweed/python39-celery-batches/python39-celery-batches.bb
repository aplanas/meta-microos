SUMMARY = "Django module to process multiple Celery task requests together"
DESCRIPTION = "An alternate way to have Django DRY forms. The developer can build \
programmatic reusable layouts out of components, having control of \
the rendered HTML without writing HTML in templates, without breaking \
the standard way of doing things in Django, so that it still works \
with any other form application."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python39-celery-batches-0.8.1-1.1.noarch.rpm"
RPM_HASH = "d3939ec441541b8f2d1aa49d0046df2cb432f1b3c775d58933335d6e433c51e9b6000a5efb9183e30c5390c9c83ce504a98ade901d5e0943efb583e829836c9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-celery-batches \
python39-celery-batches \
python3dist-celery-batches"

RDEPENDS:${PN} += "python-abi \
python39-celery"

inherit rpm
