SUMMARY = "Library for Hawk HTTP authorization"
DESCRIPTION = "Mohawk is an alternate Python implementation of the Hawk HTTP \
authorization scheme."
LICENSE = "MPL-2.0"

PV = "1.1.0"

RPM_NAME = "python310-mohawk-1.1.0-5.4.noarch.rpm"
RPM_HASH = "93ba70124f164028252a1ad57ba05713553a348c34583296221e1d3857ee71b1def2c2c79e6aa673075c781b02c78353d92ba24e52a9b789c9f4b859e8d1476c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mohawk \
python3.10dist-mohawk \
python310-mohawk \
python3dist-mohawk"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
