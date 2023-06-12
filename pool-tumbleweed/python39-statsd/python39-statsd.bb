SUMMARY = "A simple statsd client"
DESCRIPTION = "statsd is a front-end to Graphite. This is a Python client \
for the statsd daemon."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python39-statsd-3.3.0-3.5.noarch.rpm"
RPM_HASH = "c2e8f4499c68ed64db0706a85c70d06557a92f332e63fe27fcfa4bfdeeeb9cdc91d40867cf04ba205e9873b8f698885643263bbb7c41a48391a15c5da84ccb29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(statsd) \
python39-statsd \
python3dist(statsd)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
