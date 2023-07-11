SUMMARY = "PyAnnotate: Auto-generate PEP-484 annotations"
DESCRIPTION = "This module inserts annotations into source code based on call \
arguments and return types observed at runtime."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python39-pyannotate-1.2.0-5.1.noarch.rpm"
RPM_HASH = "87d974f51bddb47d849fe3c26f0b3a3892bd3f979aec42bfeb509f6604ed6dfde22e9cf7ac43b06284c7451389d4067f941ab7ef4583de3eb1bb9c03777a38aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyannotate \
python39-pyannotate \
python3dist-pyannotate"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-mypy-extensions \
python39-six \
python39-typing \
update-alternatives"

inherit rpm
