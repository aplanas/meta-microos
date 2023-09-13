SUMMARY = "The Python 'ana' module"
DESCRIPTION = "A Python module that provides an undocumented data layer for Python objects."
LICENSE = "BSD-2-Clause"

PV = "0.06"

RPM_NAME = "python311-ana-0.06-4.1.noarch.rpm"
RPM_HASH = "ea4f033ed907b774d53721ee37e6808e77a65ce794b3354e1cd9da1b80ea95cbc3b04979eecbb65286c87c6d32c0f478f7206b60cf8e7a14ff26228065d6c621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ana \
python3.11dist-ana \
python311-ana \
python3dist-ana"

RDEPENDS:${PN} += "python-abi"

inherit rpm
