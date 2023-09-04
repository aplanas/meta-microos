SUMMARY = "Django module to process multiple Celery task requests together"
DESCRIPTION = "An alternate way to have Django DRY forms. The developer can build \
programmatic reusable layouts out of components, having control of \
the rendered HTML without writing HTML in templates, without breaking \
the standard way of doing things in Django, so that it still works \
with any other form application."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python311-celery-batches-0.8.1-1.1.noarch.rpm"
RPM_HASH = "798822511700cf0da60c5d2fab343c0711614133e2c218346a9bafdcad6866c3733b83a464f83090da93e64d5325ade170771590b038ce8ac27b4b8ce080844c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-celery-batches \
python3.11dist-celery-batches \
python311-celery-batches \
python3dist-celery-batches"

RDEPENDS:${PN} += "python-abi \
python311-celery"

inherit rpm
