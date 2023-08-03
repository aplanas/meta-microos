SUMMARY = "Documentation for texlive-pst-math"
DESCRIPTION = "This package includes the documentation for texlive-pst-math"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.66svn64732"

RPM_NAME = "texlive-pst-math-doc-2023.209.0.0.66svn64732-53.1.noarch.rpm"
RPM_HASH = "80fd76a0824e5a356a648c4c1f75d91392077660e78466c97b30130cafbfcb74e9350b571d49248a92446d52fee2fd89c29be1238392e1f8a794d2e65ac96002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
