SUMMARY = "Documentation for texlive-parselines"
DESCRIPTION = "This package includes the documentation for texlive-parselines"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn21475"

RPM_NAME = "texlive-parselines-doc-2023.201.1.4svn21475-51.1.noarch.rpm"
RPM_HASH = "6ccc3772c589998c3fcfc02d0d3a29d7820c1ac9f744d23cd6f9565d57813f8d524e08960bc098ded4fc59576f975a452ec4b02f7a7b9214234e412c5ad888d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parselines-doc"

RDEPENDS:${PN} += ""

inherit rpm
