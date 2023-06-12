SUMMARY = "Documentation for libtorrent-rasterbar"
DESCRIPTION = "Documentation for the libtorrent-rasterbar package."
LICENSE = "BSD-3-Clause"

PV = "2.0.9"

RPM_NAME = "libtorrent-rasterbar-doc-2.0.9-1.1.noarch.rpm"
RPM_HASH = "9e4f34c1a21b69cd2857a08428a017072144a0f99e354a50adf5d510bfd4b30a66e595eba3e012c1d44753b8668a5338975d4b0cfa2295f539fc8a9f151b7c78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libtorrent-rasterbar-doc"
RDEPENDS:${PN} += ""

inherit rpm
