SUMMARY = "Spatially Oriented Format for Acoustics (SOFA) API for Python"
DESCRIPTION = "A Python API for reading, writing and creating SOFA files as defined \
by the SOFA conventions (version 1.0)."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-python-sofa-0.2.0-4.3.noarch.rpm"
RPM_HASH = "e1970fadc26fc511d54919b507600fe2fcb772e3f359d3be434f214f1b0db790f4f3b66d8c201e5a01a867483e38510ad7606432ce383dd4576c6f701ac3965f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-sofa \
python3.10dist-python-sofa \
python310-python-sofa \
python3dist-python-sofa"

RDEPENDS:${PN} += "python-abi \
python310-netCDF4 \
python310-numpy \
python310-scipy"

inherit rpm
