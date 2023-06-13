SUMMARY = "A web frontend for monitoring and administrating Celery clusters"
DESCRIPTION = "Flower is a web based tool for monitoring and administrating Celery clusters."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-flower-1.1.0-1.5.noarch.rpm"
RPM_HASH = "4bb12c54d872bb49856630a5785871ec4385d4cde8cf44b9444ab72e2db449128ff99085a3250f5c1d4f77ea3fcce4cc84813b3ac12a063a765e69cb166bf5e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flower \
python3.10dist(flower) \
python310-flower \
python3dist(flower)"

RDEPENDS:${PN} += "python(abi) \
python310-Babel \
python310-celery \
python310-certifi \
python310-humanize \
python310-prometheus_client \
python310-pytz \
python310-tornado \
update-alternatives"

inherit rpm
