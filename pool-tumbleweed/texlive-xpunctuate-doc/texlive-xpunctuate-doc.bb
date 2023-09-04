SUMMARY = "Documentation for texlive-xpunctuate"
DESCRIPTION = "This package includes the documentation for texlive-xpunctuate"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn26641"

RPM_NAME = "texlive-xpunctuate-doc-2023.209.1.0svn26641-53.2.noarch.rpm"
RPM_HASH = "823900a47736a8605683b91bc6c0dbbcee91d79b1a1de00b13ddba7458bcb322f80ef5148d409a8980b247d2c35d3c7c235383bceeb90fa7c069ed8bef1ce19a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpunctuate-doc"

RDEPENDS:${PN} += ""

inherit rpm
