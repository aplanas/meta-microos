SUMMARY = "Python tools for handling intervals"
DESCRIPTION = "Python tools for handling intervals (ranges of comparable objects)."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python310-intervals-0.9.2-1.5.noarch.rpm"
RPM_HASH = "47002e6b122173c0ec1ea1ea5cd70b12ab284c40607f276bc24e0ecc752a50c9518f9d28a52fefb68ee3c8092dd73d68531d7fab80af85dae410c62898ad8bf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-intervals \
python3.10dist(intervals) \
python310-intervals \
python3dist(intervals)"

RDEPENDS:${PN} += "python(abi) \
python310-infinity"

inherit rpm
