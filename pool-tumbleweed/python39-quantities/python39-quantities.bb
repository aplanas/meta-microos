SUMMARY = "Package for physical quantities with units"
DESCRIPTION = "Support for physical quantities with units, based on numpy."
LICENSE = "BSD-3-Clause"

PV = "0.14.1"

RPM_NAME = "python39-quantities-0.14.1-1.4.noarch.rpm"
RPM_HASH = "dd9dc8b877e3bc2c3fb8c019390da2dcd1ce725db1a0028fe6484dd5911585dbbfd37011b57697d5676ff1ea2d39d24136655224736bb84fad6a4a8c8602970e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-quantities \
python39-quantities \
python3dist-quantities"

RDEPENDS:${PN} += "python-abi \
python39-numpy"

inherit rpm
