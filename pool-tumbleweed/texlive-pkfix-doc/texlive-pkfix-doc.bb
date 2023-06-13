SUMMARY = "Documentation for texlive-pkfix"
DESCRIPTION = "This package includes the documentation for texlive-pkfix"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn26032"

RPM_NAME = "texlive-pkfix-doc-2023.201.1.7svn26032-51.1.noarch.rpm"
RPM_HASH = "1ea6dd09870c28a2afde6f20297d5f32789c779ab0e97b3c4fafcd64956758706034e18c722be75b986dcae43f17df860a97f5244707f09d73f6eaf7b5b1f011"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pkfix-doc"

RDEPENDS:${PN} += ""

inherit rpm
