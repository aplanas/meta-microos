SUMMARY = "Database-backed Periodic Tasks"
DESCRIPTION = "Database-backed Periodic Tasks."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python310-django-celery-beat-2.5.0-1.1.noarch.rpm"
RPM_HASH = "92999567ed372898c591c045d1c204709040a9eb3413af3576caa24532a671c4694e16ede737eedefe96d3ba9a25d96679672b02e13e9ba5d3cfb95cc87a3ca2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-celery-beat \
python310-django-celery-beat \
python3dist-django-celery-beat"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-celery \
python310-cron-descriptor \
python310-django-timezone-field \
python310-python-crontab \
timezone"

inherit rpm
