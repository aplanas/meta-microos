SUMMARY = "Documentation for texlive-gcite"
DESCRIPTION = "This package includes the documentation for texlive-gcite"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn15878"

RPM_NAME = "texlive-gcite-doc-2023.209.1.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "1b01230e981a3ace449b5cb520c285f0fb63adaa850fbbfcb2e535fe683f1e8d1c06d24559d2de6b6b8e3be35ac349d592e76de75c50aad3246fd59ce21285d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gcite-doc"

RDEPENDS:${PN} += ""

inherit rpm
