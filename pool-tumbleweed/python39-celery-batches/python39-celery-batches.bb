SUMMARY = "Django module to process multiple Celery task requests together"
DESCRIPTION = "An alternate way to have Django DRY forms. The developer can build \
programmatic reusable layouts out of components, having control of \
the rendered HTML without writing HTML in templates, without breaking \
the standard way of doing things in Django, so that it still works \
with any other form application."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python39-celery-batches-0.7-1.4.noarch.rpm"
RPM_HASH = "9596363c053b5ae4bc8f6cb6dccacef497459d82ff33f825fda543cc9de8f1ffd0e4bb417485b97c7d59f2d9bf2c31f575b4fa195db09a9db20de8b22c57a174"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-celery-batches \
python39-celery-batches \
python3dist-celery-batches"

RDEPENDS:${PN} += "python-abi \
python39-celery"

inherit rpm
