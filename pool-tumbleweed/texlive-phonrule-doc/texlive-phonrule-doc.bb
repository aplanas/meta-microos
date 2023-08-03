SUMMARY = "Documentation for texlive-phonrule"
DESCRIPTION = "This package includes the documentation for texlive-phonrule"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.2svn43963"

RPM_NAME = "texlive-phonrule-doc-2023.209.1.3.2svn43963-52.1.noarch.rpm"
RPM_HASH = "9d003ed3202cae7d8d21d9faf0c8ee27f3d295c1c2f4c7ada389e0688821b944d7fb3b7a2c29fb6d56fe19cdd00a62dfca71b32a1ddaa0679742a8b10e824bb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phonrule-doc"

RDEPENDS:${PN} += ""

inherit rpm
