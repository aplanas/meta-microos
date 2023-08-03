SUMMARY = "Documentation for texlive-ascii-font"
DESCRIPTION = "This package includes the documentation for texlive-ascii-font"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn29989"

RPM_NAME = "texlive-ascii-font-doc-2023.209.2.0svn29989-54.1.noarch.rpm"
RPM_HASH = "e5f80c12c9190509b57928cf8d0d8cf87f8dad160bf8754d7bf2a0666f51eed6e490d011d624e9eff690af4e13d9ca7019929675d59ab39fa6026e1c5fd8f380"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ascii-font-doc"

RDEPENDS:${PN} += ""

inherit rpm
