SUMMARY = "Documentation for texlive-pst-venn"
DESCRIPTION = "This package includes the documentation for texlive-pst-venn"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn49316"

RPM_NAME = "texlive-pst-venn-doc-2023.209.0.0.01svn49316-54.2.noarch.rpm"
RPM_HASH = "c3181003b6a4c338eab906aeec62751f6f1c317848cdfa9e9abf1e84c42d3b4a704074c0385fd2665fc9cd8ff310b383122628b0547693d9242807ef0a80f5b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-venn-doc"

RDEPENDS:${PN} += ""

inherit rpm
