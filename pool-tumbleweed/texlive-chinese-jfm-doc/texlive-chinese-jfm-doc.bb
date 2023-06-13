SUMMARY = "Documentation for texlive-chinese-jfm"
DESCRIPTION = "This package includes the documentation for texlive-chinese-jfm"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn57758"

RPM_NAME = "texlive-chinese-jfm-doc-2023.201.1.1.1svn57758-53.1.noarch.rpm"
RPM_HASH = "d5768cf057e1ba49552a1578f256c050612c1199237bf043a416caf5dca825161b10919d8c05c9d543b1c09e4c9ef4ae3b031b9cb18e7b4443dce328da74ff28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-chinese-jfm-doc:zh) \
texlive-chinese-jfm-doc"

RDEPENDS:${PN} += ""

inherit rpm
