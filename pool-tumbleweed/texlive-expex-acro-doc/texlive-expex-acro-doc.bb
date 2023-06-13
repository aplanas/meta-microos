SUMMARY = "Documentation for texlive-expex-acro"
DESCRIPTION = "This package includes the documentation for texlive-expex-acro"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.2svn63319"

RPM_NAME = "texlive-expex-acro-doc-2023.201.0.0.0.2svn63319-52.1.noarch.rpm"
RPM_HASH = "5f63b2cb99838fc5c069e06402d2b103ae311f197fbb1b105a32ec99a9083418c5515cec420f9d64bbeea144490b41cc27c742527e87d680b2920747808294a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expex-acro-doc"

RDEPENDS:${PN} += ""

inherit rpm
