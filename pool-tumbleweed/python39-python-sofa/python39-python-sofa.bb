SUMMARY = "Spatially Oriented Format for Acoustics (SOFA) API for Python"
DESCRIPTION = "A Python API for reading, writing and creating SOFA files as defined \
by the SOFA conventions (version 1.0)."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-python-sofa-0.2.0-4.5.noarch.rpm"
RPM_HASH = "962417eb01e7680bd8a6701ce5be2f15ce420e806ec03586a7e24e0ce64acb11c4b8350f60b016a15e78c38c15b371a872f7aa1fe11073f9aa127f3743c3cefc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-sofa \
python39-python-sofa \
python3dist-python-sofa"

RDEPENDS:${PN} += "python-abi \
python39-netCDF4 \
python39-numpy \
python39-scipy"

inherit rpm
