SUMMARY = "Documentation for texlive-jlreq-deluxe"
DESCRIPTION = "This package includes the documentation for texlive-jlreq-deluxe"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn66115"

RPM_NAME = "texlive-jlreq-deluxe-doc-2023.201.0.0.4.1svn66115-55.1.noarch.rpm"
RPM_HASH = "8713bd8461832a521f48f89005e4ae32d16da7eee902da41d7d7d937d0c19e5ea70a44be381a724ad1f3f18b2715955123158db2a83a56fb34abaf03f8492519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jlreq-deluxe-doc-ja \
texlive-jlreq-deluxe-doc"

RDEPENDS:${PN} += ""

inherit rpm
