SUMMARY = "Documentation for texlive-outlining"
DESCRIPTION = "This package includes the documentation for texlive-outlining"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn45601"

RPM_NAME = "texlive-outlining-doc-2023.209.0.0.1svn45601-55.1.noarch.rpm"
RPM_HASH = "4bdcbe1c5438ce3cc87cdd0f8680d8171ce8c843c38c0d2f3ce85c1423f041af23398106a318f36807a29cafeb7b071992ba3b51a86309b8bf6aaf33ad1170ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-outlining-doc"

RDEPENDS:${PN} += ""

inherit rpm
