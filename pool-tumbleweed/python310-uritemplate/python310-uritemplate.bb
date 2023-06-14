SUMMARY = "URI Template Expansison"
DESCRIPTION = "This is a Python implementation of RFC6570, URI Template, and can expand \
templates up to and including Level 4 in that specification"
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python310-uritemplate-4.1.1-2.3.noarch.rpm"
RPM_HASH = "312f6721b4e8eef57a892fb66f129b731d759d259eea4efbae5c9633de2141d709f5d6f9b90b614b3ca271626819161126cac42f59952b4d74c7809fdaed3548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uritemplate \
python3.10dist-uritemplate \
python310-uritemplate \
python3dist-uritemplate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
