SUMMARY = "General Hardware Management Initiative (IPMI and others)"
DESCRIPTION = "This is a pure python implementation of IPMI protocol. \
 \
pyghmicons and pyghmiutil are example scripts to show how one may incorporate \
this library into python code \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "1.5.61"

RPM_NAME = "python3-pyghmi-1.5.61-1.1.noarch.rpm"
RPM_HASH = "9c90edd40183a8bde0c599e019888d91a8d70c893a3f588a20cd26b64f243bf5cdc71fe687e005bd88aca2ecb3d27b10601825a1ac740c318de133f1008f0770"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyghmi \
python3.11dist-pyghmi \
python3dist-pyghmi"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-cryptography \
python3-python-dateutil \
python3-six"

inherit rpm
