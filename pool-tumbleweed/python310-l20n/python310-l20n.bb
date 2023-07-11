SUMMARY = "Python L20n library"
DESCRIPTION = "L20n mozilla markings for translations. \
 \
Better solution today is to use python fluent module."
LICENSE = "Apache-2.0"

PV = "4.0.0a1"

RPM_NAME = "python310-l20n-4.0.0a1-2.4.noarch.rpm"
RPM_HASH = "20bcb4bf7461781761544dd1e2ca8bc90c5509b2afb7276a824cbb09d0580c077bb0d22d2e8207d7861ef804ba02551c6408d1d57f7923bd9bb383d5fb69b123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-l20n \
python310-l20n \
python3dist-l20n"

RDEPENDS:${PN} += "python-abi"

inherit rpm
