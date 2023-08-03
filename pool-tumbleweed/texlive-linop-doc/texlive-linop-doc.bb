SUMMARY = "Documentation for texlive-linop"
DESCRIPTION = "This package includes the documentation for texlive-linop"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn41304"

RPM_NAME = "texlive-linop-doc-2023.209.0.0.1svn41304-55.1.noarch.rpm"
RPM_HASH = "6a32b9515b49a080b9849db7a988b66a88bff9afc76a3ca4da081c1316371663af0d40e72bb09dcb4014855ada34808f59186e1b4ab2975c133eabfff0593997"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linop-doc"

RDEPENDS:${PN} += ""

inherit rpm
