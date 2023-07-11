SUMMARY = "Spatially Oriented Format for Acoustics (SOFA) API for Python"
DESCRIPTION = "A Python API for reading, writing and creating SOFA files as defined \
by the SOFA conventions (version 1.0)."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-python-sofa-0.2.0-4.5.noarch.rpm"
RPM_HASH = "d7ab907324ff38074e44a178b49c18594cd704b04dc2accc0efb85e25af290caaac1e425b0823da230609a2fccb9a53c74c3f2ba643770876c20d6bc8bcd1571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-sofa \
python310-python-sofa \
python3dist-python-sofa"

RDEPENDS:${PN} += "python-abi \
python310-netCDF4 \
python310-numpy \
python310-scipy"

inherit rpm
