SUMMARY = "Django module to process multiple Celery task requests together"
DESCRIPTION = "An alternate way to have Django DRY forms. The developer can build \
programmatic reusable layouts out of components, having control of \
the rendered HTML without writing HTML in templates, without breaking \
the standard way of doing things in Django, so that it still works \
with any other form application."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python310-celery-batches-0.7-1.4.noarch.rpm"
RPM_HASH = "1b24155d32c00a41a20a1ece84c2c76b186b0192d741e768ab02c2cdd98ad75a2f0548ed2ee7f4f6faab13409888c20929ebc455d7c1bd2e0290141c3e6cd1ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-celery-batches \
python310-celery-batches \
python3dist-celery-batches"

RDEPENDS:${PN} += "python-abi \
python310-celery"

inherit rpm
