SUMMARY = "A low-level PDF generator"
DESCRIPTION = "A low-level PDF generator written in Python and based on PDF specification 1.7."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python39-pydyf-0.6.0-1.3.noarch.rpm"
RPM_HASH = "e360cdb1f38e86c9b98ba0711795c3c99f2bc6824f234ada6adc8f10b803f665c921f2d08556c509b2254cefcd5427e36aba9a6001a2d85bd44d09c95818f6b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydyf \
python39-pydyf \
python3dist-pydyf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
