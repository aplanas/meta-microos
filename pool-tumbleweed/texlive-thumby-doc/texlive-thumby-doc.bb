SUMMARY = "Documentation for texlive-thumby"
DESCRIPTION = "This package includes the documentation for texlive-thumby"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1svn16736"

RPM_NAME = "texlive-thumby-doc-2023.201.0.0.1svn16736-54.1.noarch.rpm"
RPM_HASH = "bd0c24d90dfab1ec8957677c749a4920b3746e95790127538065192c967f89aba809bb3975b7be71096588697b4fac6775a66a4e2dc50f2c6aea12fc110492fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thumby-doc"

RDEPENDS:${PN} += ""

inherit rpm
