SUMMARY = "Python 2/3 unicode CSV compatibility layer"
DESCRIPTION = "Python 2/3 unicode CSV compatibility layer"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python310-csv23-0.3.4-2.3.noarch.rpm"
RPM_HASH = "a460f063bc042cbdb31b6ae85a97a8ef74b5b087e85a253bfd58552e946049e821bfff72f0bc8cb35693a71052a8aeb6932a81228dfc6552a59f7b77f7179fcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-csv23 \
python310-csv23 \
python3dist-csv23"

RDEPENDS:${PN} += "python-abi"

inherit rpm
