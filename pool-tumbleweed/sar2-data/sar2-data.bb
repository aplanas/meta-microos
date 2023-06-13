SUMMARY = "Data files for sar2"
DESCRIPTION = "Data files for Search and Rescue II"
LICENSE = "GPL-2.0-only"

PV = "2.5.0"

RPM_NAME = "sar2-data-2.5.0-2.3.noarch.rpm"
RPM_HASH = "95809c78258c3ff91ac3a2657f82f2513c8ddee7ac39bcfe4f0d826f25e5ff39e288b8c8af79677e77dc26a39e3b6e14f8834ad361cc21f3f14cc6ed6dad4b3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sar2-data"

RDEPENDS:${PN} += "sar2"

inherit rpm
