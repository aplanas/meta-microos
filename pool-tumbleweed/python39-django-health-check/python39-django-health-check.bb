SUMMARY = "Run checks on Django and is dependent services"
DESCRIPTION = "This project checks for various conditions and provides reports when anomalous \
behavior is detected. \
 \
Services checked include databases, caches, queue servers, celery processes, etc."
LICENSE = "MIT"

PV = "3.16.5"

RPM_NAME = "python39-django-health-check-3.16.5-3.5.noarch.rpm"
RPM_HASH = "812b0db36d61601e2f815f908b96f858b53d8ba8992a36abd8e3d08ba9ea8933a6335243ef7c90c877954703d56c98de54f5854c069ce209f0f809f0e892da4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-health-check) \
python39-django-health-check \
python3dist(django-health-check)"

RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
