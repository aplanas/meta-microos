SUMMARY = "Python implementation of the SOFA Convention"
DESCRIPTION = "pysofaconventions is a python implementation of the SOFA Specification."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "python310-pysofaconventions-0.1.5-2.9.noarch.rpm"
RPM_HASH = "dc0fd508abcafab9c8925abe73880c8cf1a4413fc3188a7eb5ffed10724575efa78b04594694b08c0df5d3720afd8970eafa8cbdaca41f9ea0bbfa8eca622008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pysofaconventions \
python310-pysofaconventions \
python3dist-pysofaconventions"

RDEPENDS:${PN} += "python-abi \
python310-netCDF4"

inherit rpm
