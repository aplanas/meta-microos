SUMMARY = "Plugin for managing VCR.py cassettes"
DESCRIPTION = "Plugin for managing VCR.py cassettes."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-pytest-vcr-1.0.2-1.14.noarch.rpm"
RPM_HASH = "869d89716100057f1ed859d33ca2e12d0143aa178d61597af22ced1a4df65faaf41c9775ee39fd644da2eb02fa459629036d17cef1da0c46b742392a62018f8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-vcr) \
python39-pytest-vcr \
python3dist(pytest-vcr)"

RDEPENDS:${PN} += "python(abi) \
python39-pytest \
python39-vcrpy"

inherit rpm
