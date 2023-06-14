SUMMARY = "Documentation for texlive-przechlewski-book"
DESCRIPTION = "This package includes the documentation for texlive-przechlewski-book"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23552"

RPM_NAME = "texlive-przechlewski-book-doc-2023.201.svn23552-52.1.noarch.rpm"
RPM_HASH = "1ad4afa74c6187fc83d317c2bb8b783055f3f35afc19f446fae8f2a315a82da3d1070d6899518dcc3542b3710cd8fa7369a4ca5b0aea2cd7071532598cacd972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-przechlewski-book-doc-en;pl \
texlive-przechlewski-book-doc"

RDEPENDS:${PN} += ""

inherit rpm
