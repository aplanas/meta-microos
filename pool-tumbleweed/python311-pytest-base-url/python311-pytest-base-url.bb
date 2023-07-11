SUMMARY = "Pytest plugin for URL based testing"
DESCRIPTION = "pytest plugin for URL based testing."
LICENSE = "MPL-2.0"

PV = "2.0.0"

RPM_NAME = "python311-pytest-base-url-2.0.0-2.1.noarch.rpm"
RPM_HASH = "c25aa015989ffe16612e508d242c03cbba4976799be9017d162752904059d32cc3988880f068710ef4e90cc5c69bc05a54054fc4aea2f77207cc7a34837f6808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-base-url \
python3.11dist-pytest-base-url \
python311-pytest-base-url \
python3dist-pytest-base-url"

RDEPENDS:${PN} += "python-abi \
python311-pytest \
python311-requests"

inherit rpm
