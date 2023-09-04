SUMMARY = "Documentation for texlive-revquantum"
DESCRIPTION = "This package includes the documentation for texlive-revquantum"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn43505"

RPM_NAME = "texlive-revquantum-doc-2023.209.0.0.11svn43505-54.2.noarch.rpm"
RPM_HASH = "d4c4853c28ff552cdb0a03c9deb7bf3ef933e560ccbd78cc0071df65a7e15202b81d0be3020a6dc5a25a36c64d83141b210f6c815a7a46e0637c18ad1f5ab0a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revquantum-doc"

RDEPENDS:${PN} += ""

inherit rpm
