SUMMARY = "Ethercodes Data for arpwatch"
DESCRIPTION = "Fetch OUI and company ID data from IEEE.org prepared for arpwatch."
LICENSE = "BSD-3-Clause"

PV = "20230808"

RPM_NAME = "arpwatch-ethercodes-20230808-1.1.noarch.rpm"
RPM_HASH = "778ce1270f7f08ce480f4472abeb4c164532d2805ebbd3d72248e7f1cec577b8557e5b221faa3e487280370167da3b963e1ff46d25197ee000b0a487a1f8c89f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arpwatch-ethercodes"

RDEPENDS:${PN} += ""

inherit rpm
