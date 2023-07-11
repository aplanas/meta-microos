SUMMARY = "Documentation for texlive-eqparbox"
DESCRIPTION = "This package includes the documentation for texlive-eqparbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.1svn45215"

RPM_NAME = "texlive-eqparbox-doc-2023.201.4.1svn45215-53.2.noarch.rpm"
RPM_HASH = "5e41a3e998a8c7132327a38f3e493515d4ea2bf4c605f372b3e081e4fcdf7e349d3cd2f2c00f1d9c238df9cf44600a2305d29c257af858ac0d57b17c915a3244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqparbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
