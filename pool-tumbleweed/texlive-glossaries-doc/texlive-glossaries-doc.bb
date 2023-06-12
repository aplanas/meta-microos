SUMMARY = "Documentation for texlive-glossaries"
DESCRIPTION = "This package includes the documentation for texlive-glossaries"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.52svn64919"

RPM_NAME = "texlive-glossaries-doc-2023.201.4.52svn64919-53.1.noarch.rpm"
RPM_HASH = "9b507a11a52d9d80358d846a481a12a02efbabb752db630bed5f3b59540c8c2ffed16417ca77712259db417062dcbf9bc58fe4ecf1fcf0bfa5a6c18b74d9c41b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(makeglossaries-lite.1) \
man(makeglossaries.1) \
texlive-glossaries-doc"
RDEPENDS:${PN} += ""

inherit rpm
