SUMMARY = "Documentation for texlive-pst-pulley"
DESCRIPTION = "This package includes the documentation for texlive-pst-pulley"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn62977"

RPM_NAME = "texlive-pst-pulley-doc-2023.209.0.0.02svn62977-54.1.noarch.rpm"
RPM_HASH = "fa64085628b1fba99788b633738f19253733bc7313263e9e55d86369ac20f1f0051e446c5453f04354645de75b656d6bafe5576bc6b47ee6c1f3320b07ead903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-pulley-doc"

RDEPENDS:${PN} += ""

inherit rpm
