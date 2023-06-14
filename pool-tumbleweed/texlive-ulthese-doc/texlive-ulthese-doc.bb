SUMMARY = "Documentation for texlive-ulthese"
DESCRIPTION = "This package includes the documentation for texlive-ulthese"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.3asvn60217"

RPM_NAME = "texlive-ulthese-doc-2023.201.5.3asvn60217-53.1.noarch.rpm"
RPM_HASH = "a55c0016f98ebe67a09a170df8f0dffdbd200487bfbad256dc59ff86c289acbe69ddce4f6294c5fb98ac05564ac4988e5da33289df8a9d9f4d2a7ddc834caf1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ulthese-doc-fr \
texlive-ulthese-doc"

RDEPENDS:${PN} += ""

inherit rpm
