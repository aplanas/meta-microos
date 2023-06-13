SUMMARY = "Documentation for texlive-luahyphenrules"
DESCRIPTION = "This package includes the documentation for texlive-luahyphenrules"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56200"

RPM_NAME = "texlive-luahyphenrules-doc-2023.201.1.1svn56200-52.1.noarch.rpm"
RPM_HASH = "428d23ab6abe32a6719e365a93e902a0332bfc82466aa86cb9754dc05541dcd39f51b3b70ed4850d5084a101d903b2086622f0ee6e24aac7559d3422ba7d9b1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luahyphenrules-doc"

RDEPENDS:${PN} += ""

inherit rpm
