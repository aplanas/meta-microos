SUMMARY = "Documentation for texlive-jlreq-deluxe"
DESCRIPTION = "This package includes the documentation for texlive-jlreq-deluxe"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn66115"

RPM_NAME = "texlive-jlreq-deluxe-doc-2023.209.0.0.4.1svn66115-56.1.noarch.rpm"
RPM_HASH = "678c6fd527b928953ea7e4f4d4ce8738229d2a2d34fc310110a673643f0ebc0bc3e5f4c37b557ee4cd4763f512ca8fa08f695b237c8fc64c08e58b0b9530d693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jlreq-deluxe-doc-ja \
texlive-jlreq-deluxe-doc"

RDEPENDS:${PN} += ""

inherit rpm
