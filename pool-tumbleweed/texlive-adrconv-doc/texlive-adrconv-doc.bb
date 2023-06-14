SUMMARY = "Documentation for texlive-adrconv"
DESCRIPTION = "This package includes the documentation for texlive-adrconv"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn46817"

RPM_NAME = "texlive-adrconv-doc-2023.201.1.4svn46817-54.1.noarch.rpm"
RPM_HASH = "f605d4582c115cd14480840d7bd77fe51285d25b7f35cc5839ffa238a93a3655c7c1c9ae82046c0eb53b4b07822f7d67efaa951086f793c322cebf74e3f902a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-adrconv-doc-de \
texlive-adrconv-doc"

RDEPENDS:${PN} += ""

inherit rpm
