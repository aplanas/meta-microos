SUMMARY = "Documentation for texlive-babel-catalan"
DESCRIPTION = "This package includes the documentation for texlive-babel-catalan"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2psvn30259"

RPM_NAME = "texlive-babel-catalan-doc-2023.201.2.2psvn30259-53.1.noarch.rpm"
RPM_HASH = "ea486bcba7a21a0a0143f6d708bc1b70f13937f816ffd7ad0bbbf6e6a182160340c4ed52abcbfcd57d25f559957f16c5109e5477eb55f83aa2af3b40aa6cb0e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-catalan-doc"

RDEPENDS:${PN} += ""

inherit rpm
