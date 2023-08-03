SUMMARY = "Database-backed Periodic Tasks"
DESCRIPTION = "Database-backed Periodic Tasks."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python311-django-celery-beat-2.5.0-1.1.noarch.rpm"
RPM_HASH = "7ad49c499fb9793397ac06c601f3e361fc16cd9d0551a006376bedb415253dec3dfbf8420d3ac64582cc22e134e849df733fabeb88054caba6e320adad3f70b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-celery-beat \
python3.11dist-django-celery-beat \
python311-django-celery-beat \
python3dist-django-celery-beat"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-celery \
python311-cron-descriptor \
python311-django-timezone-field \
python311-python-crontab \
timezone"

inherit rpm
