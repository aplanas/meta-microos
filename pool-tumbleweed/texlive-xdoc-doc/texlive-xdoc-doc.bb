SUMMARY = "Documentation for texlive-xdoc"
DESCRIPTION = "This package includes the documentation for texlive-xdoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.prot2.5svn15878"

RPM_NAME = "texlive-xdoc-doc-2023.209.prot2.5svn15878-53.1.noarch.rpm"
RPM_HASH = "1f3f889df1561e9f38d7a79f2ae11fb724b34fd2933e9955f771c89f8d3ecf30f6e4dee7b30557589b6d4759eecc2cc6c1adde562d01d42e8f7ee32eed1265ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
