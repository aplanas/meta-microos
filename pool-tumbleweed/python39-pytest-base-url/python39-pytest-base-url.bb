SUMMARY = "Pytest plugin for URL based testing"
DESCRIPTION = "pytest plugin for URL based testing."
LICENSE = "MPL-2.0"

PV = "2.0.0"

RPM_NAME = "python39-pytest-base-url-2.0.0-2.1.noarch.rpm"
RPM_HASH = "2ecf10c321baf3dbf29880786eb49d746a0311c9f461697d5efe1ec8b9d3685bb0eba88449e39e4bfbf42b727290be9cb687b735c5465dc7136f548b64d3c0f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-base-url \
python39-pytest-base-url \
python3dist-pytest-base-url"

RDEPENDS:${PN} += "python-abi \
python39-pytest \
python39-requests"

inherit rpm
