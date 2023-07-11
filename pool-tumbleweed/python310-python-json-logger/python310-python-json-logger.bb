SUMMARY = "A python library adding a json log formatter"
DESCRIPTION = "A python library adding a json log formatter."
LICENSE = "BSD-2-Clause"

PV = "2.0.7"

RPM_NAME = "python310-python-json-logger-2.0.7-1.2.noarch.rpm"
RPM_HASH = "829ab9ba863f2b096e655d91e565290faa467943a9a3cde938a9cb071f07060c03a1297af7d3200819ff5b9398f303975469d83bb2586ad74a59c4b107d76049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-json-logger \
python310-python-json-logger \
python3dist-python-json-logger"

RDEPENDS:${PN} += "python-abi \
python310-setuptools"

inherit rpm
