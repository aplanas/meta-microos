SUMMARY = "Spatially Oriented Format for Acoustics (SOFA) API for Python"
DESCRIPTION = "A Python API for reading, writing and creating SOFA files as defined \
by the SOFA conventions (version 1.0)."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-python-sofa-0.2.0-4.5.noarch.rpm"
RPM_HASH = "72114bd776e48682acbe45672998b595e7378bae913956731ac54b4094e3aebe2a15aae6b40ed2636f4d3b4a3b4b30b4353a7f7da9f37d389b76a3f72c54c0be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-sofa \
python3.11dist-python-sofa \
python311-python-sofa \
python3dist-python-sofa"

RDEPENDS:${PN} += "python-abi \
python311-netCDF4 \
python311-numpy \
python311-scipy"

inherit rpm
