SUMMARY = "PEP 518 build backend using setuptools_scm and flit"
DESCRIPTION = "A PEP 518 build backend that uses setuptools_scm to generate a version file \
from your version control system, then flit to build the package."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-flit-scm-1.7.0-2.1.noarch.rpm"
RPM_HASH = "324999773e06319e687ab7c255639b5c889363e9aa98a281ff54dd44ab5983dfe6b8fec217fe6ebd2d9e2a16d7b03fb6606dd035cf6a6259af1a5e50b22979e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flit-scm \
python39-flit-scm \
python3dist-flit-scm"

RDEPENDS:${PN} += "python-abi \
python39-flit-core \
python39-setuptools-scm \
python39-tomli"

inherit rpm
