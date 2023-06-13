SUMMARY = "Documentation for texlive-babel-estonian"
DESCRIPTION = "This package includes the documentation for texlive-babel-estonian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn38064"

RPM_NAME = "texlive-babel-estonian-doc-2023.201.1.1asvn38064-53.1.noarch.rpm"
RPM_HASH = "faa25ca9781173c6e5c77baf17a0e468b18c77edf794b4d6762dbf3f099a537bd9e70c84b0a1cd2f77fd99f45e322448c2ff337a11e55d11ddd26c0d5eab644f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-estonian-doc"

RDEPENDS:${PN} += ""

inherit rpm
