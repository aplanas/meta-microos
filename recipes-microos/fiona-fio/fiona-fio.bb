SUMMARY = "Program for reading and writing spatial data files"
DESCRIPTION = "Command-line interface for reading and writing spatial data \
using OGR's Fiona package."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "fiona-fio-1.9.1-1.3.noarch.rpm"
RPM_HASH = "65711cbacbdccde4abd9f80c1d57ccf242dc42f088f91ab0bff8ab63e704758d2e23f619e5e87ce64519aa6cfc0a2651db2e19bf38c55d87f8c960ca754b7f65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fiona-fio"
RDEPENDS:${PN} += "/usr/bin/python3.10 \
python3-Fiona"

inherit rpm
