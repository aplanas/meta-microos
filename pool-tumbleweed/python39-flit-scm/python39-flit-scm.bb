SUMMARY = "PEP 518 build backend using setuptools_scm and flit"
DESCRIPTION = "A PEP 518 build backend that uses setuptools_scm to generate a version file \
from your version control system, then flit to build the package."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-flit-scm-1.7.0-2.3.noarch.rpm"
RPM_HASH = "c641c63673fdd070ec59f63e932abf9ae118ee276edb1574db55dde9889ad96dd486bf2c2aaac37ee928fbc6715bf49b2a0248073fccb57c191d0f4a8a9d4924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flit-scm \
python39-flit-scm \
python3dist-flit-scm"

RDEPENDS:${PN} += "python-abi \
python39-flit-core \
python39-setuptools-scm \
python39-tomli"

inherit rpm
