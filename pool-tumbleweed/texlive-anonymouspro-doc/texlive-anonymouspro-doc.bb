SUMMARY = "Documentation for texlive-anonymouspro"
DESCRIPTION = "This package includes the documentation for texlive-anonymouspro"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn51631"

RPM_NAME = "texlive-anonymouspro-doc-2023.209.2.2svn51631-55.1.noarch.rpm"
RPM_HASH = "58411262f2f90d24a7911471170a0933804d91c2b23b925bc5c8f903e8ecb3a812cb2c2f79a6054cb90aff090d992ef7bb5f3e0cc07f6a961f1dc31f4209f5e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anonymouspro-doc"

RDEPENDS:${PN} += ""

inherit rpm
