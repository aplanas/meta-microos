SUMMARY = "Python implementation of the SOFA Convention"
DESCRIPTION = "pysofaconventions is a python implementation of the SOFA Specification."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "python311-pysofaconventions-0.1.5-2.9.noarch.rpm"
RPM_HASH = "ff5e81c5c1980af29223637339f4eeefd8401d12f0d3971477b46e0a2d3462bf9004c0c886924a32e72435d803305a1e98fd6362d8ed3c5aafa51b23e93d64b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysofaconventions \
python3.11dist-pysofaconventions \
python311-pysofaconventions \
python3dist-pysofaconventions"

RDEPENDS:${PN} += "python-abi \
python311-netCDF4"

inherit rpm
