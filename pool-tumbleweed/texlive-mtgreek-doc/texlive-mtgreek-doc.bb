SUMMARY = "Documentation for texlive-mtgreek"
DESCRIPTION = "This package includes the documentation for texlive-mtgreek"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1+svn17967"

RPM_NAME = "texlive-mtgreek-doc-2023.209.1.1+svn17967-55.1.noarch.rpm"
RPM_HASH = "dfd256192fbd322087b657500fc2cb46816811d7491cd591753b530cdac37f4f81ec9c1d1742a361239cb650d83c14ff612c91382d0a807addc5953bedea0899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mtgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
