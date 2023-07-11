SUMMARY = "Run checks on Django and is dependent services"
DESCRIPTION = "This project checks for various conditions and provides reports when anomalous \
behavior is detected. \
 \
Services checked include databases, caches, queue servers, celery processes, etc."
LICENSE = "MIT"

PV = "3.16.5"

RPM_NAME = "python310-django-health-check-3.16.5-3.7.noarch.rpm"
RPM_HASH = "135fa2ccddbb7c2854acaeb52ebf25136eea5aa1c24cd04ef6ab80991a60e00633e89c2605a125c3e9cb1d3c6a6f69ebbad724fbd59b33d4a36af2bf7e4f2ebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-health-check \
python310-django-health-check \
python3dist-django-health-check"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
