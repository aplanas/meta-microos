SUMMARY = "Documentation for texlive-tagpdf"
DESCRIPTION = "This package includes the documentation for texlive-tagpdf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.98esvn66461"

RPM_NAME = "texlive-tagpdf-doc-2023.209.0.0.98esvn66461-55.1.noarch.rpm"
RPM_HASH = "ba9b0af2ca54712e59e21e5739474bd7768c2280c10d7bbafd0d9d9e0368c81e25056b41e3971da10d52aca0575bd9fff2228da62fc849742e78cdc2ce138403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tagpdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
