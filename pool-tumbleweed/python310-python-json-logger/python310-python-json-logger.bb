SUMMARY = "A python library adding a json log formatter"
DESCRIPTION = "A python library adding a json log formatter."
LICENSE = "BSD-2-Clause"

PV = "2.0.7"

RPM_NAME = "python310-python-json-logger-2.0.7-2.1.noarch.rpm"
RPM_HASH = "75d2a8a0bae9036bbb5ff82374726d167ea1e7bc634bc1dad4c2527af3ca5e230fbd007375cf61f66d8906301bba941a959257e43b0726868ffc3bd0d20514c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-json-logger \
python310-python-json-logger \
python3dist-python-json-logger"

RDEPENDS:${PN} += "python-abi"

inherit rpm
