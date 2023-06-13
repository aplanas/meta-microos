SUMMARY = "Spatially Oriented Format for Acoustics (SOFA) API for Python"
DESCRIPTION = "A Python API for reading, writing and creating SOFA files as defined \
by the SOFA conventions (version 1.0)."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-python-sofa-0.2.0-4.3.noarch.rpm"
RPM_HASH = "300beb72382d57da238266eaa379b1ac44045256026773995f9adfe8e1b1144f10a02f394d21a2a6894a4eac8093989e73b9920a615e864ac59a3ab5d7bc5600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-sofa) \
python39-python-sofa \
python3dist(python-sofa)"

RDEPENDS:${PN} += "python(abi) \
python39-netCDF4 \
python39-numpy \
python39-scipy"

inherit rpm
