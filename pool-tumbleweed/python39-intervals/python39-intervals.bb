SUMMARY = "Python tools for handling intervals"
DESCRIPTION = "Python tools for handling intervals (ranges of comparable objects)."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python39-intervals-0.9.2-1.5.noarch.rpm"
RPM_HASH = "70b3292812d4b23b543a01af1f30abac3cbc198dee8df455a6f9036f3dafa7cb7a2416f4694042959e8956b7a4da9dd415fd39a2477966eb3b932b5d059aa2ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(intervals) \
python39-intervals \
python3dist(intervals)"
RDEPENDS:${PN} += "python(abi) \
python39-infinity"

inherit rpm
