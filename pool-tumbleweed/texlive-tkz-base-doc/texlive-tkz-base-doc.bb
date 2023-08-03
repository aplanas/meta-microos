SUMMARY = "Documentation for texlive-tkz-base"
DESCRIPTION = "This package includes the documentation for texlive-tkz-base"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2csvn66115"

RPM_NAME = "texlive-tkz-base-doc-2023.209.4.2csvn66115-53.1.noarch.rpm"
RPM_HASH = "e3eba4e4e4cd65e8fcc31c79144f75e66294cff7b574bae7593933f062d1f24847c5ea6ea223828cdd3af0bcecbdc72f048544f88726a2212997ab917954b7f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tkz-base-doc-fr \
texlive-tkz-base-doc"

RDEPENDS:${PN} += ""

inherit rpm
