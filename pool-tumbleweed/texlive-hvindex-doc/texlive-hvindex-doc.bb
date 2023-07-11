SUMMARY = "Documentation for texlive-hvindex"
DESCRIPTION = "This package includes the documentation for texlive-hvindex"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.04svn46051"

RPM_NAME = "texlive-hvindex-doc-2023.208.0.0.04svn46051-53.1.noarch.rpm"
RPM_HASH = "cf28b555b24e0a551a4fea347453756cbcd9ca9ec95f9bd504cee3af208c7882707010e3ed76cee0e678628749ee4c2ca6e4901922ba32818191627663f23d89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
