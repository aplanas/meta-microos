SUMMARY = "Documentation for texlive-frontespizio"
DESCRIPTION = "This package includes the documentation for texlive-frontespizio"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4asvn24054"

RPM_NAME = "texlive-frontespizio-doc-2023.201.1.4asvn24054-52.1.noarch.rpm"
RPM_HASH = "a1f387cd1e4ae0a667c08bd067cbe4873e4b2962d8f05332a1aca9bca53d9a16692fe6dfd9b27f45695d736bf6620d1acb9a7f95cd95d3f9fec88e687f6889dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-frontespizio-doc-it \
texlive-frontespizio-doc"

RDEPENDS:${PN} += ""

inherit rpm
