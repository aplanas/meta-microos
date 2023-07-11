SUMMARY = "A web frontend for monitoring and administrating Celery clusters"
DESCRIPTION = "Flower is a web based tool for monitoring and administrating Celery clusters."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-flower-1.1.0-1.7.noarch.rpm"
RPM_HASH = "f66eb536aec7a246c715aabcb93e3dd64ccec5845608890868a0ef0a8a7d565b616318dc9a48189dd6fd163a1c55dc47f3d9c8938eb548aeaa005bbf4664561f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flower \
python39-flower \
python3dist-flower"

RDEPENDS:${PN} += "python-abi \
python39-Babel \
python39-celery \
python39-certifi \
python39-humanize \
python39-prometheus-client \
python39-pytz \
python39-tornado \
update-alternatives"

inherit rpm
