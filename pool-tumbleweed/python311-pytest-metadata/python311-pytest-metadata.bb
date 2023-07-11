SUMMARY = "Pytest plugin for test session metadata"
DESCRIPTION = "Pytest plugin for test session metadata."
LICENSE = "MPL-2.0"

PV = "2.0.4"

RPM_NAME = "python311-pytest-metadata-2.0.4-2.3.noarch.rpm"
RPM_HASH = "ed8efe6168773beafdb126135ed3a546cd283327495cb9d50219cbdef093721eb4e0f51069a7a581bcf8cbd468714d460047ed20f7b0f2218d093eb021bd04f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-metadata \
python3.11dist-pytest-metadata \
python311-pytest-metadata \
python3dist-pytest-metadata"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
