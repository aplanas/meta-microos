SUMMARY = "Django module to process multiple Celery task requests together"
DESCRIPTION = "An alternate way to have Django DRY forms. The developer can build \
programmatic reusable layouts out of components, having control of \
the rendered HTML without writing HTML in templates, without breaking \
the standard way of doing things in Django, so that it still works \
with any other form application."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python311-celery-batches-0.7-1.2.noarch.rpm"
RPM_HASH = "66b6d62a13f5a7adb8471e1e01d81fa85b76b68469d969331990ca4eb25942990e55af5ef831622413b107672fe4eb40b71f26419500db038a78dbb022461b7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(celery-batches) \
python311-celery-batches \
python3dist(celery-batches)"

RDEPENDS:${PN} += "python(abi) \
python311-celery"

inherit rpm
