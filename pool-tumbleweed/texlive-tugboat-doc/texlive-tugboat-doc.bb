SUMMARY = "Documentation for texlive-tugboat"
DESCRIPTION = "This package includes the documentation for texlive-tugboat"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.29svn66513"

RPM_NAME = "texlive-tugboat-doc-2023.209.2.29svn66513-53.1.noarch.rpm"
RPM_HASH = "340008006682de378f73dca920a62b721502e63b786c18e945f20ef5f926637447f0f8a72740b662a295743e937be67eef46ac0d836173e533d069b7ccc6f22a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tugboat-doc-en \
texlive-tugboat-doc"

RDEPENDS:${PN} += ""

inherit rpm
