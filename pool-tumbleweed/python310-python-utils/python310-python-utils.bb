SUMMARY = "Utilities not included with the standard Python install"
DESCRIPTION = "Python Utils is a collection of Python functions and \
classes which make common patterns shorter and easier."
LICENSE = "BSD-3-Clause"

PV = "3.4.5"

RPM_NAME = "python310-python-utils-3.4.5-1.5.noarch.rpm"
RPM_HASH = "75605aea764b91e8e1b79e002c4b074b147594781271f75fd11c6a515c9379f9d1ebf902b72a7d302e73a4c5132e5bc7bb10294a82d4581119752766726fa436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-utils \
python310-python-utils \
python3dist-python-utils"

RDEPENDS:${PN} += "python-abi \
python310-loguru"

inherit rpm
