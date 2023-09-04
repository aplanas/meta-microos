SUMMARY = "Documentation for texlive-pst-platon"
DESCRIPTION = "This package includes the documentation for texlive-pst-platon"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn16538"

RPM_NAME = "texlive-pst-platon-doc-2023.209.0.0.01svn16538-54.2.noarch.rpm"
RPM_HASH = "d993359e84a85e654dc64f42dddb674eb3f51522e81363238747c1b1a2c2e368e3dac4939229099c3a56cc06b3223b09f4369f3c91594225f0930de82ccf3669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-platon-doc"

RDEPENDS:${PN} += ""

inherit rpm
