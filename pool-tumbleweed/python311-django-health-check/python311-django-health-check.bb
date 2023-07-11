SUMMARY = "Run checks on Django and is dependent services"
DESCRIPTION = "This project checks for various conditions and provides reports when anomalous \
behavior is detected. \
 \
Services checked include databases, caches, queue servers, celery processes, etc."
LICENSE = "MIT"

PV = "3.16.5"

RPM_NAME = "python311-django-health-check-3.16.5-3.7.noarch.rpm"
RPM_HASH = "d1d71b6e48051bd0af09f83762299c4d696477176f8e9b37e9cd4b01445df1c7251f8622dfe159ff9a4a2a28c6fcbeba7a44948e93b9c237b0518ccdc44e3f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-health-check \
python3.11dist-django-health-check \
python311-django-health-check \
python3dist-django-health-check"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
