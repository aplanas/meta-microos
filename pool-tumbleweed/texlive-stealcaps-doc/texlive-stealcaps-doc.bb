SUMMARY = "Documentation for texlive-stealcaps"
DESCRIPTION = "This package includes the documentation for texlive-stealcaps"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64967"

RPM_NAME = "texlive-stealcaps-doc-2023.201.1.1svn64967-57.1.noarch.rpm"
RPM_HASH = "ca8086d24afeac85bb03d353f00fb64486315c2d7aa7365d13651fb3bbd0fe0e5f2b8fe4304e498592aa6b9223e99a507a98d3360093efed95e3029e1ecf649f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stealcaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
