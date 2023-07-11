SUMMARY = "Python implementation of the SOFA Convention"
DESCRIPTION = "pysofaconventions is a python implementation of the SOFA Specification."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "python39-pysofaconventions-0.1.5-2.9.noarch.rpm"
RPM_HASH = "28132e6bfbd0d3a8941907f7a85486bead4ba942bdcd225dd8a1bdb9fbfdace766252794a1fb9ab5ad32b50c3f790251368bcf253658284471c35e62c1b350a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pysofaconventions \
python39-pysofaconventions \
python3dist-pysofaconventions"

RDEPENDS:${PN} += "python-abi \
python39-netCDF4"

inherit rpm
