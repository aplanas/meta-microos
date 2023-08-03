SUMMARY = "Documentation for texlive-exercisepoints"
DESCRIPTION = "This package includes the documentation for texlive-exercisepoints"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.3svn49590"

RPM_NAME = "texlive-exercisepoints-doc-2023.209.1.2.3svn49590-53.1.noarch.rpm"
RPM_HASH = "689db697e54aff7383a5e1ab664928fb354aae951234b6d1472bc56851ea68cdf34666794e120d26940226f7b75093ae09fa1a7585981365c448ef07a29eaaca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exercisepoints-doc"

RDEPENDS:${PN} += ""

inherit rpm
