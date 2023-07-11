SUMMARY = "PEP 518 build backend using setuptools_scm and flit"
DESCRIPTION = "A PEP 518 build backend that uses setuptools_scm to generate a version file \
from your version control system, then flit to build the package."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-flit-scm-1.7.0-2.3.noarch.rpm"
RPM_HASH = "f09eb9dc7729ff50c00cdbcca7e2306897f7b3d2f3ab2852bb93629c187c0c8e3cfc04b6a5740d7e0217d3fa20c42eaa544564929bba3cba017dcdf3fc10d2e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flit-scm \
python310-flit-scm \
python3dist-flit-scm"

RDEPENDS:${PN} += "python-abi \
python310-flit-core \
python310-setuptools-scm \
python310-tomli"

inherit rpm
