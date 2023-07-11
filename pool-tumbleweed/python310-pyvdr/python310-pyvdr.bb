SUMMARY = "Python library for accessing a Linux VDR via SVDRP"
DESCRIPTION = "Python library for accessing a Linux VDR via SVDRP."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python310-pyvdr-0.3.1-1.10.noarch.rpm"
RPM_HASH = "2809d31e4fe1374ab9dcadb79e418a83ee4ef3caa67960dc0532132cb0f727d3454965ee1c04d8aeb9b6aff6df4e051c1a89afeb4064560d0bab8a4d8f0acce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyvdr \
python310-pyvdr \
python3dist-pyvdr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
