SUMMARY = "Documentation for texlive-jslectureplanner"
DESCRIPTION = "This package includes the documentation for texlive-jslectureplanner"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.12svn57095"

RPM_NAME = "texlive-jslectureplanner-doc-2023.209.1.12svn57095-56.1.noarch.rpm"
RPM_HASH = "6802565a9e44975d36a2eb6bf4e22d901f368e62aa324a4be2ddd65d302724c39bf40e75ca1db3e16f641e44f4765b1e6dbc3d88430988562c698efe373ecc4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jslectureplanner-doc"

RDEPENDS:${PN} += ""

inherit rpm
