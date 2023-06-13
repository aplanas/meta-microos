SUMMARY = "Documentation for texlive-longnamefilelist"
DESCRIPTION = "This package includes the documentation for texlive-longnamefilelist"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn27889"

RPM_NAME = "texlive-longnamefilelist-doc-2023.201.0.0.2svn27889-54.1.noarch.rpm"
RPM_HASH = "7d85f794799a055041560353b6d1cf833955f27e6c65b5d80c6439d9cced32dbdab9c340771da1dd682d46581c3bb6ebbf7cff90d85f972190464e49bd9a435d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-longnamefilelist-doc"

RDEPENDS:${PN} += ""

inherit rpm
