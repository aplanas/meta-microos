SUMMARY = "Ethercodes Data for arpwatch"
DESCRIPTION = "Fetch OUI and company ID data from IEEE.org prepared for arpwatch."
LICENSE = "BSD-3-Clause"

PV = "20230420"

RPM_NAME = "arpwatch-ethercodes-20230420-1.1.noarch.rpm"
RPM_HASH = "5e2375fdf5409a687c7d0dcd86d1fd16b8f62e5ad7d04c52c1b7e93f52dee7018f2cf3af1dfbf045c79fd9a50f3d38d5c549f2432f2a1cb9fb07121285155feb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arpwatch-ethercodes"
RDEPENDS:${PN} += ""

inherit rpm
