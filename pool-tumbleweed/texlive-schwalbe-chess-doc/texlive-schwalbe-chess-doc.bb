SUMMARY = "Documentation for texlive-schwalbe-chess"
DESCRIPTION = "This package includes the documentation for texlive-schwalbe-chess"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.12svn63708"

RPM_NAME = "texlive-schwalbe-chess-doc-2023.201.2.12svn63708-53.1.noarch.rpm"
RPM_HASH = "fda0d51f56217effd2f1627c9e1f3e39bce85cc8ab938782359bf0a9e30fcfbaa61ac2679a0bfad33661dd25607e0a774cf588c05847532a4291af1a880f85a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-schwalbe-chess-doc:de) \
texlive-schwalbe-chess-doc"

RDEPENDS:${PN} += ""

inherit rpm
