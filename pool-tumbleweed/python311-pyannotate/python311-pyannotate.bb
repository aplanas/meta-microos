SUMMARY = "PyAnnotate: Auto-generate PEP-484 annotations"
DESCRIPTION = "This module inserts annotations into source code based on call \
arguments and return types observed at runtime."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python311-pyannotate-1.2.0-4.4.noarch.rpm"
RPM_HASH = "18ceb13a6aa7856a7aeb65e15bc89ce4d71cd7f681647cdf09217d14d7a35913b6b9b22ccbe3646922d4d415f6e8ca5aa1ed870ee2a2978e2693d54715a28a23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyannotate \
python311-pyannotate \
python3dist-pyannotate"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-mypy-extensions \
python311-six \
python311-typing \
update-alternatives"

inherit rpm
