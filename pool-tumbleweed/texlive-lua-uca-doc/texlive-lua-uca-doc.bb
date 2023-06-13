SUMMARY = "Documentation for texlive-lua-uca"
DESCRIPTION = "This package includes the documentation for texlive-lua-uca"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1bsvn61023"

RPM_NAME = "texlive-lua-uca-doc-2023.201.0.0.1bsvn61023-52.1.noarch.rpm"
RPM_HASH = "6ec040f17c524bad84df9e346a4b9fa8fe1091f430753296e1e81ff2f90a10938388a3f2c35ed7c1e0c7fa7aba6cf3fa771e97057eddd6b1ff6ab07051a71f76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-uca-doc"

RDEPENDS:${PN} += ""

inherit rpm
