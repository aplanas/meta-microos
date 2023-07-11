SUMMARY = "PyAnnotate: Auto-generate PEP-484 annotations"
DESCRIPTION = "This module inserts annotations into source code based on call \
arguments and return types observed at runtime."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python310-pyannotate-1.2.0-5.1.noarch.rpm"
RPM_HASH = "2cfa63e88c195b8666c32c17d80e23aae5a6e1c71a3ab060e2167e1886b2eae993e42748b0d27d8ef1413779393448f39a2beec05bd8d472ed5cce97eee85d8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyannotate \
python310-pyannotate \
python3dist-pyannotate"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-mypy-extensions \
python310-six \
python310-typing \
update-alternatives"

inherit rpm
