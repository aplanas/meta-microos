SUMMARY = "Documentation for texlive-c90"
DESCRIPTION = "This package includes the documentation for texlive-c90"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn60830"

RPM_NAME = "texlive-c90-doc-2023.209.svn60830-53.1.noarch.rpm"
RPM_HASH = "b90402674cd6181a2aaf5b45ea0131c106c0f93ff0e793a265ff85347fa8aa41ffcae6462b3fcc96e7359c6ec97b2955e22600a6b744c9428e2a4c9cb96753d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-c90-doc"

RDEPENDS:${PN} += ""

inherit rpm
