SUMMARY = "Documentation for texlive-adhocfilelist"
DESCRIPTION = "This package includes the documentation for texlive-adhocfilelist"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29349"

RPM_NAME = "texlive-adhocfilelist-doc-2023.201.svn29349-54.1.noarch.rpm"
RPM_HASH = "59123f62c3626c75feb4ba28cebdc204c017dcd99761d52a73babc0bb1043d97f31e20220d3f0f9ff990b20a14f04b6fb4e14177f554eae471c9f47b974c001d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adhocfilelist-doc"
RDEPENDS:${PN} += ""

inherit rpm
