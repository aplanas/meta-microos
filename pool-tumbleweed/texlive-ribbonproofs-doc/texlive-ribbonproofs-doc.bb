SUMMARY = "Documentation for texlive-ribbonproofs"
DESCRIPTION = "This package includes the documentation for texlive-ribbonproofs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn31137"

RPM_NAME = "texlive-ribbonproofs-doc-2023.209.1.0svn31137-54.1.noarch.rpm"
RPM_HASH = "4dbf15f961a8000332b50624db961868476b0b354cf42e399f6c9440c081a3db2a452bb08ed8d8e81fc50cf47c1a1c7a348c2b291350b584f670f42ab1e298d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ribbonproofs-doc"

RDEPENDS:${PN} += ""

inherit rpm
