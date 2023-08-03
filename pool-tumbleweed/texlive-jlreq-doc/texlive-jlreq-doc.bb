SUMMARY = "Documentation for texlive-jlreq"
DESCRIPTION = "This package includes the documentation for texlive-jlreq"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66362"

RPM_NAME = "texlive-jlreq-doc-2023.209.svn66362-56.1.noarch.rpm"
RPM_HASH = "5772c5cb443c0a604fc0e1ae79b4188d1706ceb0145fae376c9460c8591b3a435156ee0dfb1e83b00d7608a88e984f29c9d6281c352810796d0ea33b11367c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jlreq-doc-ja \
texlive-jlreq-doc"

RDEPENDS:${PN} += ""

inherit rpm
