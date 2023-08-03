SUMMARY = "Documentation for texlive-scontents"
DESCRIPTION = "This package includes the documentation for texlive-scontents"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn62902"

RPM_NAME = "texlive-scontents-doc-2023.209.2.0svn62902-54.1.noarch.rpm"
RPM_HASH = "56a7412eac76ed05406a25c0208ef19e2b9de770d0dcf3c148b9204d783226e647366c8963405723a2557d5909384834efca9e7481b3bdfbf37399ff42625a37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scontents-doc"

RDEPENDS:${PN} += ""

inherit rpm
