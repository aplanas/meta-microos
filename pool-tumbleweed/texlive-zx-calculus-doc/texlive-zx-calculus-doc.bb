SUMMARY = "Documentation for texlive-zx-calculus"
DESCRIPTION = "This package includes the documentation for texlive-zx-calculus"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn60838"

RPM_NAME = "texlive-zx-calculus-doc-2023.209.svn60838-53.2.noarch.rpm"
RPM_HASH = "12ed4a86d5731067888babaab88bad34ca30311095ed6ef28be2ba6c16bdec6d88cdbe404a9407e8f4e916b90fb2f7791c67cadb20905cb8399a7efcb37d563c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zx-calculus-doc"

RDEPENDS:${PN} += ""

inherit rpm
