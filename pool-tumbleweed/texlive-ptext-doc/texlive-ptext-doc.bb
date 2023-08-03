SUMMARY = "Documentation for texlive-ptext"
DESCRIPTION = "This package includes the documentation for texlive-ptext"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn30171"

RPM_NAME = "texlive-ptext-doc-2023.209.1.1svn30171-54.1.noarch.rpm"
RPM_HASH = "665c8c4f5af5ed8e4289cdb7fc014dbe39ec81f53c6b4882de293409696cd7c673729134b32a7d71aeb3bed6a121a3c03ec93e80052a63e168d94e90f18e379f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ptext-doc-fa \
texlive-ptext-doc"

RDEPENDS:${PN} += ""

inherit rpm
