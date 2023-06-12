SUMMARY = "PEP 518 build backend using setuptools_scm and flit"
DESCRIPTION = "A PEP 518 build backend that uses setuptools_scm to generate a version file \
from your version control system, then flit to build the package."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-flit-scm-1.7.0-2.1.noarch.rpm"
RPM_HASH = "0e46f862c6f4d7817336a83c6ddef37306db48726e5aa825addbdd22bbd6ed1fdf2d4a7e32b0742b731d17fb0bdeff5cafe0cd7baf84b6623b90532db3fe999d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flit-scm \
python3.10dist(flit-scm) \
python310-flit-scm \
python3dist(flit-scm)"
RDEPENDS:${PN} += "python(abi) \
python310-flit-core \
python310-setuptools_scm \
python310-tomli"

inherit rpm
