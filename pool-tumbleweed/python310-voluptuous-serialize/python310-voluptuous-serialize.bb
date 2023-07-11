SUMMARY = "Python module to convert voluptuous schemas to dictionaries"
DESCRIPTION = "A Python module to convert voluptuous schemas to dictionaries."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python310-voluptuous-serialize-2.5.0-1.5.noarch.rpm"
RPM_HASH = "61bdbe35b1e89d725a39e04ad5b835318c6d81b445bc05e6c4c533c5d9747c8d2163d43d5540931af49ba6e58e3bc810d0504d23627e02e479a13e02565d2fc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-voluptuous-serialize \
python310-voluptuous-serialize \
python3dist-voluptuous-serialize"

RDEPENDS:${PN} += "python-abi \
python310-voluptuous"

inherit rpm
