SUMMARY = "A collection of cache libraries in the same API interface"
DESCRIPTION = "A collection of cache libraries in the same API interface."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "python39-cachelib-0.10.2-3.3.noarch.rpm"
RPM_HASH = "9b412b4771e34d789c48382e7ee9c3baf28ff1562173e787784cdf1d86d0c7b9f040870f8628ae33a713cf4ca4df9786eec93ad91c2ae94c1a15aaad26cfc410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cachelib \
python39-cachelib \
python3dist-cachelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
