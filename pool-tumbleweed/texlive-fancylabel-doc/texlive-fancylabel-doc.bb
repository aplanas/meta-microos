SUMMARY = "Documentation for texlive-fancylabel"
DESCRIPTION = "This package includes the documentation for texlive-fancylabel"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn46736"

RPM_NAME = "texlive-fancylabel-doc-2023.209.1.1svn46736-53.1.noarch.rpm"
RPM_HASH = "123f46e4f44684cc74fb9ffbba838a36c396bc8b755b0e9b72f14ff9d3c74024374eb8384ddc60d0069a8c803bab5c1e2428aab0149298cdbde33a2757029319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancylabel-doc"

RDEPENDS:${PN} += ""

inherit rpm
