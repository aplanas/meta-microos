SUMMARY = "Documentation for texlive-tex4ht"
DESCRIPTION = "This package includes the documentation for texlive-tex4ht"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66530"

RPM_NAME = "texlive-tex4ht-doc-2023.209.svn66530-55.1.noarch.rpm"
RPM_HASH = "899edc11ffcfd01bfabb06be27cfa2aced4623328e36b2619893819bd1a619e23c0dbb0675e44a60825a374bd380f44c399976dbf320c67a909876a4343cb4ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex4ht-doc"

RDEPENDS:${PN} += ""

inherit rpm
