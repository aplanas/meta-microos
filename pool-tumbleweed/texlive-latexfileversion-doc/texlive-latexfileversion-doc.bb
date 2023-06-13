SUMMARY = "Documentation for texlive-latexfileversion"
DESCRIPTION = "This package includes the documentation for texlive-latexfileversion"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn29349"

RPM_NAME = "texlive-latexfileversion-doc-2023.201.0.0.3svn29349-54.1.noarch.rpm"
RPM_HASH = "c056e0629476f12c332acac22a319ade9b8792074f5defefaadf07bb4cd1791973dc7788b441bef1f1f858686cc58483e793393934f90729ff7ffad1435494d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexfileversion-doc"

RDEPENDS:${PN} += ""

inherit rpm
