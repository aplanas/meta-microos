SUMMARY = "Documentation for texlive-ftcap"
DESCRIPTION = "This package includes the documentation for texlive-ftcap"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.4svn17275"

RPM_NAME = "texlive-ftcap-doc-2023.201.1.4svn17275-52.1.noarch.rpm"
RPM_HASH = "34ddaae7e7f1e41ab29e777d07ab5f0ddab9a92f20d0fa50b01fdcd9ef6265f320d8c9e29a2a341f4ff422430dd7f449a8050a67b36f13d12e58418973cc4d93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ftcap-doc"
RDEPENDS:${PN} += ""

inherit rpm
