SUMMARY = "Development headers for i3"
DESCRIPTION = "Development headers for the i3 window manager."
LICENSE = "BSD-3-Clause"

PV = "4.22"

RPM_NAME = "i3-devel-4.22-1.3.aarch64.rpm"
RPM_HASH = "2f3f5f7f76e30373ae9b08a7ad9ac793a7813a6b191b17c8daf2af838f96a52da23ff06ae64786e57d652ad64a64d4aa6e28dba5dae59abf17d250825c03e722"

RPROVIDES:${PN} += "i3-devel"

RDEPENDS:${PN} += "i3"

inherit rpm
