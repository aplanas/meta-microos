SUMMARY = "Documentation for texlive-mfirstuc"
DESCRIPTION = "This package includes the documentation for texlive-mfirstuc"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.08svn64743"

RPM_NAME = "texlive-mfirstuc-doc-2023.209.2.08svn64743-55.1.noarch.rpm"
RPM_HASH = "fced1b6fbdfeb9dbdfd4f34a1ea478b45359789344982cfe3b2dc63069d3e390f9aef89973314350953f9bac73429324e9f83859984e84d0dcd1ed90246a364e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mfirstuc-doc"

RDEPENDS:${PN} += ""

inherit rpm
