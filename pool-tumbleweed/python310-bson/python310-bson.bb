SUMMARY = "BSON codec for Python"
DESCRIPTION = "BSON codec for Python."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.5.10"

RPM_NAME = "python310-bson-0.5.10-2.3.noarch.rpm"
RPM_HASH = "5bfd2c1aea7bc96d7d82591c84e262eceea10017e024c01e9f03faf7694bb626588e04188bdc4e6315b8d22f6e7f6ee31b1333a2c16ae69c34d9f9be745833a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bson \
python3.10dist(bson) \
python310-bson \
python3dist(bson)"

RDEPENDS:${PN} += "python(abi) \
python310-python-dateutil"

inherit rpm
