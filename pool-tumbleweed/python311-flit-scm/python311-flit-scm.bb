SUMMARY = "PEP 518 build backend using setuptools_scm and flit"
DESCRIPTION = "A PEP 518 build backend that uses setuptools_scm to generate a version file \
from your version control system, then flit to build the package."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-flit-scm-1.7.0-2.3.noarch.rpm"
RPM_HASH = "d4e6bb24d858a92bc42514c266ba8a7133a1b17a550d9246921461766dc71c3356e616e60a7dd51bd0232526f6ad686da309a79286eb5d4d1f76e8817f76f320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flit-scm \
python3.11dist-flit-scm \
python311-flit-scm \
python3dist-flit-scm"

RDEPENDS:${PN} += "python-abi \
python311-flit-core \
python311-setuptools-scm"

inherit rpm
