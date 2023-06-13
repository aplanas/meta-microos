SUMMARY = "Documentation for texlive-ocr-b-outline"
DESCRIPTION = "This package includes the documentation for texlive-ocr-b-outline"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20969"

RPM_NAME = "texlive-ocr-b-outline-doc-2023.201.svn20969-54.1.noarch.rpm"
RPM_HASH = "4b4e96447a8c1c2de576ba02276804a45c3828bb021e6c09a7205f9781c3236a6f35bce1a3785bc04c5a5a4f2774988225e751deb1c8f3aada0d9d1cfb60d89a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocr-b-outline-doc"

RDEPENDS:${PN} += ""

inherit rpm
