SUMMARY = "Documentation for texlive-pst-soroban"
DESCRIPTION = "This package includes the documentation for texlive-pst-soroban"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-pst-soroban-doc-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "37d36c50db116945eaec8d24317485b04a771a59736f1b8b25bf61576aa730a5911d3a1430b119f1924228edc17354d12a9da18ef11d8ad1fb90394ebdd8185a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-soroban-doc"

RDEPENDS:${PN} += ""

inherit rpm
