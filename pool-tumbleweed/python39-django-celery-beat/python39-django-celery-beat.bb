SUMMARY = "Database-backed Periodic Tasks"
DESCRIPTION = "Database-backed Periodic Tasks."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python39-django-celery-beat-2.5.0-1.1.noarch.rpm"
RPM_HASH = "9d4f7855da162654f34bbb2d19544964c697261641bd4a74c5ac91bd16f52d2639ffa6435dffc9da7ca6228dcc2bf9f0cd4cbc54837dc3e10f3de8ac6a5e89a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-celery-beat \
python39-django-celery-beat \
python3dist-django-celery-beat"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-celery \
python39-cron-descriptor \
python39-django-timezone-field \
python39-python-crontab \
timezone"

inherit rpm
