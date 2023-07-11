SUMMARY = "Plugin for managing VCR.py cassettes"
DESCRIPTION = "Plugin for managing VCR.py cassettes."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-pytest-vcr-1.0.2-2.3.noarch.rpm"
RPM_HASH = "da58370e54a4d1ed3e9baadb7d665144ad97c983b1ba1ae06c5a622fe5dfb9c68250a220eff87ad6116461dcb2be109c39eb3206b4c9bde4e57d8206fcba6329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-vcr \
python310-pytest-vcr \
python3dist-pytest-vcr"

RDEPENDS:${PN} += "python-abi \
python310-pytest \
python310-vcrpy"

inherit rpm
