SUMMARY = "Documentation for texlive-glossaries-english"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-english"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-english-doc-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "8638a6799256641fa6701ea5361fca6c4c83fa4de86a52c02752755fc1882b409298f728cbfc3b9550dc18bdab3b990e9265b347223994a77baf68773e47c349"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-english-doc"

RDEPENDS:${PN} += ""

inherit rpm
