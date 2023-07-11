SUMMARY = "Wrapper for data container objects"
DESCRIPTION = "The ItemAdapter class is a wrapper for data container objects, providing \
a common interface to handle objects of different types in an uniform \
manner, regardless of their underlying implementation."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python39-itemadapter-0.7.0-1.4.aarch64.rpm"
RPM_HASH = "f71dd120c494ebf9981ada54170a131b37f0d52ba7b864b6eefed023d2e6c94122ce68a3fa666ddc886c39dd938a647a199ec7c1d9d1bdd372a99901ed2a65fe"

RPROVIDES:${PN} += "python3.9dist-itemadapter \
python39-itemadapter \
python3dist-itemadapter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
