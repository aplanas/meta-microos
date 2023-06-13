SUMMARY = "Documentation for texlive-pagenote"
DESCRIPTION = "This package includes the documentation for texlive-pagenote"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn63708"

RPM_NAME = "texlive-pagenote-doc-2023.201.1.1asvn63708-51.1.noarch.rpm"
RPM_HASH = "e7ae2c678db3ca3fc1d59e139753190a374a7d31a8ad506ef596f558ff5abc9edf9a63adba87c84f330c32b174077edc9b00fa7b04f8ca9dcacd01f2a2532158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pagenote-doc"

RDEPENDS:${PN} += ""

inherit rpm
