SUMMARY = "PyAnnotate: Auto-generate PEP-484 annotations"
DESCRIPTION = "This module inserts annotations into source code based on call \
arguments and return types observed at runtime."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python311-pyannotate-1.2.0-5.1.noarch.rpm"
RPM_HASH = "7c281a70f76e9306811d24c3ce1c1c6b15f377b7bc9990d602914f67a72264f82a54ed99263366438f5d56ed77d7554d8fe8dc93f37bbf76fdd446f6ff525590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyannotate \
python3.11dist-pyannotate \
python311-pyannotate \
python3dist-pyannotate"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-mypy-extensions \
python311-six \
python311-typing \
update-alternatives"

inherit rpm
