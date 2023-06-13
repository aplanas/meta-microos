SUMMARY = "Documentation for texlive-tablefootnote"
DESCRIPTION = "This package includes the documentation for texlive-tablefootnote"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1csvn32804"

RPM_NAME = "texlive-tablefootnote-doc-2023.201.1.1csvn32804-57.1.noarch.rpm"
RPM_HASH = "47461b8d98fde67753d7cf9a0818bbe250e188a0a5fd15a50c72a1a82e1ccae64037f84bc9c7543431732d45222621280d056b555ee394cf100060215ebc60cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tablefootnote-doc"

RDEPENDS:${PN} += ""

inherit rpm
