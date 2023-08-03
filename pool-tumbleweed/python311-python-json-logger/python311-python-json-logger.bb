SUMMARY = "A python library adding a json log formatter"
DESCRIPTION = "A python library adding a json log formatter."
LICENSE = "BSD-2-Clause"

PV = "2.0.7"

RPM_NAME = "python311-python-json-logger-2.0.7-2.1.noarch.rpm"
RPM_HASH = "bc0295ef9e06048fb2ccf91d6afdf2d811ed29570f43bd9f3f346c556dfcc8353319268a8b6ce7b7266eed4d47ee3ae3847a69585acb26f238aa3d64160af3b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-json-logger \
python3.11dist-python-json-logger \
python311-python-json-logger \
python3dist-python-json-logger"

RDEPENDS:${PN} += "python-abi"

inherit rpm
