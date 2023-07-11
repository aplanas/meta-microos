SUMMARY = "A web frontend for monitoring and administrating Celery clusters"
DESCRIPTION = "Flower is a web based tool for monitoring and administrating Celery clusters."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-flower-1.1.0-1.7.noarch.rpm"
RPM_HASH = "d3e7a63943120c588c0f08c7811685cd0b67efee0cca78d31a478fee60764e8fc96650d2098506f89cfd2b2ef28344ebc587d07a39c96320f77f41e31a365b79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flower \
python310-flower \
python3dist-flower"

RDEPENDS:${PN} += "python-abi \
python310-Babel \
python310-celery \
python310-certifi \
python310-humanize \
python310-prometheus-client \
python310-pytz \
python310-tornado \
update-alternatives"

inherit rpm
