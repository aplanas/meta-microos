SUMMARY = "A Python library to interact with Apache HBase"
DESCRIPTION = "HappyBase is a Python library to interact with Apache HBase."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-happybase-1.2.0-3.9.noarch.rpm"
RPM_HASH = "9f92b1e158922c48dcde423fd5c740d45ff558409f2e0fa6867554d7ab0310ba5d76e1772dde6043730f27af9790269fbfa7bc632f17aa3d05b89185e2e3accf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-happybase \
python39-happybase \
python3dist-happybase"

RDEPENDS:${PN} += "python-abi \
python39-six \
python39-thriftpy2"

inherit rpm
