SUMMARY = "A simple statsd client"
DESCRIPTION = "statsd is a front-end to Graphite. This is a Python client \
for the statsd daemon."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python39-statsd-3.3.0-3.7.noarch.rpm"
RPM_HASH = "2fd2147ea8d48f292b455aa4eb444d9e7078d329ee4fa5cf61b61d40e163f624cef41dc5c2985589cef967d3808d05fa4850298318ea4d322def5bc3db561ccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-statsd \
python39-statsd \
python3dist-statsd"

RDEPENDS:${PN} += "python-abi"

inherit rpm
