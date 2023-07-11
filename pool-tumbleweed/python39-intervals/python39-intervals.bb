SUMMARY = "Python tools for handling intervals"
DESCRIPTION = "Python tools for handling intervals (ranges of comparable objects)."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python39-intervals-0.9.2-1.7.noarch.rpm"
RPM_HASH = "fa19672e0d62e14959af41e4b4e15b79e863ae749938121d9bf6c8e7e1e12ff949dbf56fe55ebbf11d7724703ac893b5cf276b5e2155112f1e1739055192ee36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-intervals \
python39-intervals \
python3dist-intervals"

RDEPENDS:${PN} += "python-abi \
python39-infinity"

inherit rpm
