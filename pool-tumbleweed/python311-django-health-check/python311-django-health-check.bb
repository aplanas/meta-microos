SUMMARY = "Run checks on Django and is dependent services"
DESCRIPTION = "This project checks for various conditions and provides reports when anomalous \
behavior is detected. \
 \
Services checked include databases, caches, queue servers, celery processes, etc."
LICENSE = "MIT"

PV = "3.16.5"

RPM_NAME = "python311-django-health-check-3.16.5-3.5.noarch.rpm"
RPM_HASH = "a08691d0cf50eccab8d4f7e2565cd1a1fee3239a6a45212c695ae8414a0c88ed3f3578954e5bebd38d1603f2cbadd683f24f3aa048b927835838cc8962591ecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-health-check \
python311-django-health-check \
python3dist-django-health-check"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
