SUMMARY = "More sophisticated version manipulation (than packaging)"
DESCRIPTION = "More sophisticated version manipulation (than packaging)"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-jaraco.versioning-1.1.0-1.1.noarch.rpm"
RPM_HASH = "532f8fcd77c09181a9f7f3f51abfede109d1b06904a471dd8c53e4b64da8c8ef8451dc581f4fd795563554bbd90fb7545d314b846cb892f4cd23a33554f93732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.versioning \
python3.11dist-jaraco.versioning \
python311-jaraco.versioning \
python3dist-jaraco.versioning"

RDEPENDS:${PN} += "python-abi \
python311-packaging"

inherit rpm
