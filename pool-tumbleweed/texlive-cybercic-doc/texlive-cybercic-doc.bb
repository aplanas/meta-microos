SUMMARY = "Documentation for texlive-cybercic"
DESCRIPTION = "This package includes the documentation for texlive-cybercic"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn37659"

RPM_NAME = "texlive-cybercic-doc-2023.209.2.1svn37659-55.1.noarch.rpm"
RPM_HASH = "14ed28166d52b3a606bb69d3991dc63fa28fd751652985ea75761d4475721e67c9b2894d3122edf470cac80b3ebcf49f3968c4ee6759f3f03353a0072f968ad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cybercic-doc"

RDEPENDS:${PN} += ""

inherit rpm
