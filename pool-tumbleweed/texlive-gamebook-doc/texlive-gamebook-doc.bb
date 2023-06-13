SUMMARY = "Documentation for texlive-gamebook"
DESCRIPTION = "This package includes the documentation for texlive-gamebook"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24714"

RPM_NAME = "texlive-gamebook-doc-2023.201.1.0svn24714-52.1.noarch.rpm"
RPM_HASH = "beff1ba947c68baed93a8bf8b3e8fb7e238acbd0312877abaeabd8620cff8ee74b10583e1805c93715f91dba115e54261abee9f2e401c34cc6e79570aa55fcf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gamebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
