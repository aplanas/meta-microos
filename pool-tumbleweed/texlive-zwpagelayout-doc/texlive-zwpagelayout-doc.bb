SUMMARY = "Documentation for texlive-zwpagelayout"
DESCRIPTION = "This package includes the documentation for texlive-zwpagelayout"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4esvn63074"

RPM_NAME = "texlive-zwpagelayout-doc-2023.209.1.4esvn63074-53.2.noarch.rpm"
RPM_HASH = "00395340cd68f66841712f9f085a51ac17edd98bb2d1b7f688271e3a6c7b47c1dd6708d370c36a8c34988c6726ac5857c8e5157ac5eaa2a050d50c341ccff99d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zwpagelayout-doc"

RDEPENDS:${PN} += ""

inherit rpm
