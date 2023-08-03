SUMMARY = "Documentation for texlive-topiclongtable"
DESCRIPTION = "This package includes the documentation for texlive-topiclongtable"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.2svn54758"

RPM_NAME = "texlive-topiclongtable-doc-2023.209.1.3.2svn54758-53.1.noarch.rpm"
RPM_HASH = "e5c0db216bd1fe856e07c08e60d19030cd6178d04f6ca82562b8ce17762a10ba5827b1651ca008ee66e4c5bdc48fa17927475171e81f9ac44fc627bb954a4934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-topiclongtable-doc"

RDEPENDS:${PN} += ""

inherit rpm
