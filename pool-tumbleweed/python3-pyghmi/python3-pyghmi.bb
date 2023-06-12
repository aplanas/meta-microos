SUMMARY = "General Hardware Management Initiative (IPMI and others)"
DESCRIPTION = "This is a pure python implementation of IPMI protocol. \
 \
pyghmicons and pyghmiutil are example scripts to show how one may incorporate \
this library into python code \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "1.5.29"

RPM_NAME = "python3-pyghmi-1.5.29-1.3.noarch.rpm"
RPM_HASH = "db2e0afffcbe99029cf3757be3e3e44fff6f73629336d96bdfd8e48ab1088c7cc2d59f12520b08a0fc10f5dc46018480334be2d8fd50a3f6ff22f5fe09fcdb9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyghmi \
python3.10dist(pyghmi) \
python3dist(pyghmi)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-cryptography \
python3-python-dateutil \
python3-six"

inherit rpm
