SUMMARY = "A web frontend for monitoring and administrating Celery clusters"
DESCRIPTION = "Flower is a web based tool for monitoring and administrating Celery clusters."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-flower-1.1.0-1.7.noarch.rpm"
RPM_HASH = "cdc78c14067fac3b08ff18fabc1f6c573a4be7aa99e8e46b45048478a0a6031b86214c237574b4750979e047bb6e09bc543acb74e8aca3c9805326258b8b72fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flower \
python3.11dist-flower \
python311-flower \
python3dist-flower"

RDEPENDS:${PN} += "python-abi \
python311-Babel \
python311-celery \
python311-certifi \
python311-humanize \
python311-prometheus-client \
python311-pytz \
python311-tornado \
update-alternatives"

inherit rpm
