SUMMARY = "Documentation for texlive-elsarticle"
DESCRIPTION = "This package includes the documentation for texlive-elsarticle"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.3svn56999"

RPM_NAME = "texlive-elsarticle-doc-2023.201.3.3svn56999-53.2.noarch.rpm"
RPM_HASH = "92318616fd4b7ae7feaa01cb0e9be65e743c5f16256ba10a202502346e750aa332b9f00b8a956c02ac7fcef58c23cf78fe962893c9a577b0917cbeb58ebb1f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elsarticle-doc"

RDEPENDS:${PN} += ""

inherit rpm
