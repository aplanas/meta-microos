SUMMARY = "Process Management Interface for MPI"
DESCRIPTION = "This Package contains necessary the headers for PMI-X."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "pmix-headers-3.2.3-10.2.noarch.rpm"
RPM_HASH = "a0b7c9c6a4649dd32cce8852419f5cb6a548b8206606aca63ab44068ae65ddbfd7b59275cd50185032d24c20ae7b447b785d0d1adfb504e9094b39c96906f351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pmix-headers"

RDEPENDS:${PN} += ""

inherit rpm
