SUMMARY = "Documentation for texlive-pxtxalfa"
DESCRIPTION = "This package includes the documentation for texlive-pxtxalfa"
LICENSE = "LPPL-1.0"

PV = "2023.209.2svn60847"

RPM_NAME = "texlive-pxtxalfa-doc-2023.209.2svn60847-54.2.noarch.rpm"
RPM_HASH = "20a63d69775f2d56f44c35b4f5f03936d34c19e4b1f0d12d28e395a14f6bd1ff9f4d75c94a9b5342ce70c3e96db9c3de9e57f7214e554ea691425949a3026a55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxtxalfa-doc"

RDEPENDS:${PN} += ""

inherit rpm
