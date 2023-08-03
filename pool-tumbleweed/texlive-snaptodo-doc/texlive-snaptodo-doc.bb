SUMMARY = "Documentation for texlive-snaptodo"
DESCRIPTION = "This package includes the documentation for texlive-snaptodo"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61155"

RPM_NAME = "texlive-snaptodo-doc-2023.209.svn61155-58.1.noarch.rpm"
RPM_HASH = "e16eb64b07c2cb515f858db65cf44c85280eba989d961fe2da8e9ac896f5407dc5593bb6b8b0c6cd8585c1fdaec85f424af3fcd4a4deccdf84b0b9564eb54b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-snaptodo-doc"

RDEPENDS:${PN} += ""

inherit rpm
