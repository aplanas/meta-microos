SUMMARY = "A simple statsd client"
DESCRIPTION = "statsd is a front-end to Graphite. This is a Python client \
for the statsd daemon."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python310-statsd-3.3.0-3.7.noarch.rpm"
RPM_HASH = "286092cc8028b401d15a3c21a85e1434680fc3e1404dd269ee7952abf5190febe57ddd74a41f390f15e00cacf3f9577951729c449b2ec290145e987102102a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-statsd \
python310-statsd \
python3dist-statsd"

RDEPENDS:${PN} += "python-abi"

inherit rpm
