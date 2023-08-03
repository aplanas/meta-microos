SUMMARY = "Documentation for texlive-resphilosophica"
DESCRIPTION = "This package includes the documentation for texlive-resphilosophica"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.35svn50935"

RPM_NAME = "texlive-resphilosophica-doc-2023.209.1.35svn50935-54.1.noarch.rpm"
RPM_HASH = "8efcea120f136274820a0783e837e3607804090b3ba5036f1ffb27f36c7666f059c7e2d7c6b34b7068fe53fdc0e63fc5dc18251cd52468e1c1742f63950432f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resphilosophica-doc"

RDEPENDS:${PN} += ""

inherit rpm
