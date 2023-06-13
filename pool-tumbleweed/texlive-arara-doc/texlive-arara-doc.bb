SUMMARY = "Documentation for texlive-arara"
DESCRIPTION = "This package includes the documentation for texlive-arara"
LICENSE = "BSD-3-Clause"

PV = "2023.201.7.0.4svn63760"

RPM_NAME = "texlive-arara-doc-2023.201.7.0.4svn63760-54.1.noarch.rpm"
RPM_HASH = "ed269fe9b812b70a1b3228679466d34485b804d51dd33615fc6af6aef9f20853f037f128e908b2d5abaa6333c5d61f4c2afa466e1a15dcfa648c1765a70d3272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(arara.1) \
texlive-arara-doc"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm
