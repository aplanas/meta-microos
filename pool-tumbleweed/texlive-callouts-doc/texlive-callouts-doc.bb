SUMMARY = "Documentation for texlive-callouts"
DESCRIPTION = "This package includes the documentation for texlive-callouts"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn44899"

RPM_NAME = "texlive-callouts-doc-2023.209.svn44899-53.1.noarch.rpm"
RPM_HASH = "bd1aafb9e7d0272f8dc871ac8dc8c80fbd3eca9df2227f670a0d6ad1f097b6504621ab85032ec369b1a562f4ba0dfbb777bcdcfd5acb10e4c901516668ee517d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-callouts-doc"

RDEPENDS:${PN} += ""

inherit rpm
