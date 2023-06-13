SUMMARY = "Documentation for texlive-pst-shell"
DESCRIPTION = "This package includes the documentation for texlive-pst-shell"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn56070"

RPM_NAME = "texlive-pst-shell-doc-2023.201.0.0.03svn56070-53.1.noarch.rpm"
RPM_HASH = "1c7b12a943e8f2fd1de407acf16f510c2596a3ea75c948b568c5ceffd98bc04914bf9bd93ba21f348001d9902d227b417136f788da47eaf633dadbd5e1438863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-shell-doc"

RDEPENDS:${PN} += ""

inherit rpm
