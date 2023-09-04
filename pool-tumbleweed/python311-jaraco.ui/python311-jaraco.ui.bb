SUMMARY = "User-Interface tools (mainly command-line)"
DESCRIPTION = "User-Interface tools (mainly command-line)"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-jaraco.ui-2.3.0-1.1.noarch.rpm"
RPM_HASH = "923aa6903769e8c2d83a914e54f8ceba92322b586d0069443e43e2d07ab93d7687f13c06757d7f3eff870c252fbb956fd867badf370e52cd2b532c9ec9eda5ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.ui \
python3.11dist-jaraco.ui \
python311-jaraco.ui \
python3dist-jaraco.ui"

RDEPENDS:${PN} += "python-abi \
python311-jaraco.classes \
python311-jaraco.text"

inherit rpm
