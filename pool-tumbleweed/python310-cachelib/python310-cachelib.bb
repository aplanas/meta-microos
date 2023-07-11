SUMMARY = "A collection of cache libraries in the same API interface"
DESCRIPTION = "A collection of cache libraries in the same API interface."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "python310-cachelib-0.10.2-3.3.noarch.rpm"
RPM_HASH = "0be0d865ce65833bbbed3e35b29da649a30dc86b489511da8264fa1d940254a8ed4ba7ba0e380fa4742aca79e0db0d8910e09261112f01331e34926d0577b6d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cachelib \
python310-cachelib \
python3dist-cachelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
