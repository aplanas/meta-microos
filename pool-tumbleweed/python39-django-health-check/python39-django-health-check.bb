SUMMARY = "Run checks on Django and is dependent services"
DESCRIPTION = "This project checks for various conditions and provides reports when anomalous \
behavior is detected. \
 \
Services checked include databases, caches, queue servers, celery processes, etc."
LICENSE = "MIT"

PV = "3.16.5"

RPM_NAME = "python39-django-health-check-3.16.5-3.7.noarch.rpm"
RPM_HASH = "ba06986dee30d4886c978d025eaeb86b9180334cd213db032b76f1c826ecf20f1f51c04cc9f9a3bb69ecea71fe0813b662caa39bd3ce71d34ad0f05fc4f72829"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-health-check \
python39-django-health-check \
python3dist-django-health-check"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
