SUMMARY = "A web frontend for monitoring and administrating Celery clusters"
DESCRIPTION = "Flower is a web based tool for monitoring and administrating Celery clusters."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-flower-1.1.0-1.5.noarch.rpm"
RPM_HASH = "2c0de1950fbef64d1665705574fc2ccf2dd334e4c02a779b1c10b102278fe03d251e340e32850941893dc415c28ffdd3f29509b297624edd646bffe197ace4a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flower) \
python39-flower \
python3dist(flower)"

RDEPENDS:${PN} += "python(abi) \
python39-Babel \
python39-celery \
python39-certifi \
python39-humanize \
python39-prometheus_client \
python39-pytz \
python39-tornado \
update-alternatives"

inherit rpm
