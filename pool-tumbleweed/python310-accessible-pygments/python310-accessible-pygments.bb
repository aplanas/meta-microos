SUMMARY = "A collection of accessible pygments styles"
DESCRIPTION = "A collection of accessible pygments styles"
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "python310-accessible-pygments-0.0.4-1.2.noarch.rpm"
RPM_HASH = "2b8aa1265f4192c58093fef8a26ffb3d1dcdf52bd85f15838bbd50d1ef54ad06d186bbf353efeb63f6cca6340eac3018107e933def10aca87c0ffcc6a43976c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-accessible-pygments \
python3.10dist(accessible-pygments) \
python310-accessible-pygments \
python3dist(accessible-pygments)"

RDEPENDS:${PN} += "python(abi) \
python310-pygments"

inherit rpm
