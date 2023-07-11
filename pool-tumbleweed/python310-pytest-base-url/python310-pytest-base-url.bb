SUMMARY = "Pytest plugin for URL based testing"
DESCRIPTION = "pytest plugin for URL based testing."
LICENSE = "MPL-2.0"

PV = "2.0.0"

RPM_NAME = "python310-pytest-base-url-2.0.0-2.1.noarch.rpm"
RPM_HASH = "2d4b724d39c70b78922601446428073a011aeb98869f88df29a96ef72e7e6c29d6629f0e8e963e98bd55e6c6bd137986dc6181d6ad000b134c42df6a6241223e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-base-url \
python310-pytest-base-url \
python3dist-pytest-base-url"

RDEPENDS:${PN} += "python-abi \
python310-pytest \
python310-requests"

inherit rpm
