SUMMARY = "Utilities not included with the standard Python install"
DESCRIPTION = "Python Utils is a collection of Python functions and \
classes which make common patterns shorter and easier."
LICENSE = "BSD-3-Clause"

PV = "3.4.5"

RPM_NAME = "python39-python-utils-3.4.5-1.5.noarch.rpm"
RPM_HASH = "cafc9087731eb3e62994bb0577875a8967d6b62b93cf3553eaa8a6be79db56ca8decba5b13c180f3dee8fe42fb8bad6f02e8bfdac74088b92ef9dd9578595ea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-utils \
python39-python-utils \
python3dist-python-utils"

RDEPENDS:${PN} += "python-abi \
python39-loguru"

inherit rpm
