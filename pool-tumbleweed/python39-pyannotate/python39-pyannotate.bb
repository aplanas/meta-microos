SUMMARY = "PyAnnotate: Auto-generate PEP-484 annotations"
DESCRIPTION = "This module inserts annotations into source code based on call \
arguments and return types observed at runtime."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python39-pyannotate-1.2.0-4.4.noarch.rpm"
RPM_HASH = "665b285da1d0c9a13a93a52004845dc0bdf91b5fe7fda5d571d8d4417d47e340a51b8e8999d3b5af22c2a04f1da0f7f97f58407c155e721988aba113e939b648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyannotate) \
python39-pyannotate \
python3dist(pyannotate)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-mypy_extensions \
python39-six \
python39-typing \
update-alternatives"

inherit rpm
