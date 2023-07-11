SUMMARY = "A python package that provides useful locks"
DESCRIPTION = "A python package that provides useful locks \
It includes the following. \
 * Locking decorator \
 * Reader-writer locks \
 * Inter-process locks \
 * Generic helpers"
LICENSE = "Apache-2.0"

PV = "0.17.3"

RPM_NAME = "python310-fasteners-0.17.3-1.6.noarch.rpm"
RPM_HASH = "bbe05cf4d53f4a45bfa424b9aa4440d11a1d96560d79d3d9f17a99ac77c06324cce21be7d796e264af8832f101374ecdbdb69387704be8c7271cc171f8bd47cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fasteners \
python310-fasteners \
python3dist-fasteners"

RDEPENDS:${PN} += "python-abi \
python310-more-itertools \
python310-six"

inherit rpm
