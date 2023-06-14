SUMMARY = "Plugin for managing VCR.py cassettes"
DESCRIPTION = "Plugin for managing VCR.py cassettes."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python311-pytest-vcr-1.0.2-1.14.noarch.rpm"
RPM_HASH = "645b544ab9012a21c47eb2d87d95c845d0c2eefd2a726748c4999c13d91c5fd40534a52138ef9095b9eadfd74a03ff5fcac605c2369d7c76863753c88ab5bb1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-vcr \
python311-pytest-vcr \
python3dist-pytest-vcr"

RDEPENDS:${PN} += "python-abi \
python311-pytest \
python311-vcrpy"

inherit rpm
