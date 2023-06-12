SUMMARY = "BSON codec for Python"
DESCRIPTION = "BSON codec for Python."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.5.10"

RPM_NAME = "python39-bson-0.5.10-2.3.noarch.rpm"
RPM_HASH = "98a7abf33e315fb6e5fb7cc495877100d56f4cd9d9b75a9d3db2adbad6a7bfaab9c1662a54f894178972fc5fe4bcd2b8f112727c55cefe6578f6fdd1428435d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bson) \
python39-bson \
python3dist(bson)"
RDEPENDS:${PN} += "python(abi) \
python39-python-dateutil"

inherit rpm
