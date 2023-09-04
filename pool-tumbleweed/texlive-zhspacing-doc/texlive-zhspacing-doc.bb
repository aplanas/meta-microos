SUMMARY = "Documentation for texlive-zhspacing"
DESCRIPTION = "This package includes the documentation for texlive-zhspacing"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn41145"

RPM_NAME = "texlive-zhspacing-doc-2023.209.svn41145-53.2.noarch.rpm"
RPM_HASH = "430aa5d7a5cdeff68a42b87635e1cbb803febecfb29ee01c3de140aa7b9507c8300be421c05a8bbb2d24b1531ce04cba8946af55807df42955ad3813b68566ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zhspacing-doc"

RDEPENDS:${PN} += ""

inherit rpm
