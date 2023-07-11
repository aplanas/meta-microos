SUMMARY = "A simple statsd client"
DESCRIPTION = "statsd is a front-end to Graphite. This is a Python client \
for the statsd daemon."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python311-statsd-3.3.0-3.7.noarch.rpm"
RPM_HASH = "ca2751f41cc2fd834d5810f3e434b675173d396d4ed647593652ee8c76266f9c154ba919437e74210f26320f07421a4a729d4219c19da6383c4afdfbe5cef8ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-statsd \
python3.11dist-statsd \
python311-statsd \
python3dist-statsd"

RDEPENDS:${PN} += "python-abi"

inherit rpm
