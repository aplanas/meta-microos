SUMMARY = "Documentation for texlive-fancyhdr"
DESCRIPTION = "This package includes the documentation for texlive-fancyhdr"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.1svn64977"

RPM_NAME = "texlive-fancyhdr-doc-2023.201.4.1svn64977-52.1.noarch.rpm"
RPM_HASH = "9598809558c243c7b4ae99488141483ac14b4fc18cdf98324224f46d7d463459b14a8ffa54a6cafef558d710b57a0fee30a3fec2b842d91bc9ff4a1ff9b6bfc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyhdr-doc"

RDEPENDS:${PN} += ""

inherit rpm
