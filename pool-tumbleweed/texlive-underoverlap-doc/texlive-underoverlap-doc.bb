SUMMARY = "Documentation for texlive-underoverlap"
DESCRIPTION = "This package includes the documentation for texlive-underoverlap"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.1_r1svn29019"

RPM_NAME = "texlive-underoverlap-doc-2023.209.0.0.0.1_r1svn29019-54.1.noarch.rpm"
RPM_HASH = "4c182b1be58ccd530d7c6bcd1149642058d6f6b45a32ecbde867b9fef6315a9f4d51335d918bb7b5476eefcd46df691405cf1ddc7b78020b7356c029ee825193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-underoverlap-doc"

RDEPENDS:${PN} += ""

inherit rpm
