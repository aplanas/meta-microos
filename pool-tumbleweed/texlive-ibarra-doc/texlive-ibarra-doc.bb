SUMMARY = "Documentation for texlive-ibarra"
DESCRIPTION = "This package includes the documentation for texlive-ibarra"
LICENSE = "OFL-1.1"

PV = "2023.208.svn64567"

RPM_NAME = "texlive-ibarra-doc-2023.208.svn64567-53.1.noarch.rpm"
RPM_HASH = "3aa1a25008419fd30b1762964ea0447dbd154cea8bffaa569cf89f858df5d64e9fcbdc54884d79dbcce300ed171f1602dfd01fba07b18e3c22754edca3a0d959"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ibarra-doc"

RDEPENDS:${PN} += ""

inherit rpm
