SUMMARY = "Documentation for texlive-makeshape"
DESCRIPTION = "This package includes the documentation for texlive-makeshape"
LICENSE = "LPPL-1.0"

PV = "2023.208.2.1svn28973"

RPM_NAME = "texlive-makeshape-doc-2023.208.2.1svn28973-53.1.noarch.rpm"
RPM_HASH = "17972e03f25155f9dc7009ba617842ac91f65409edf1c38f8b7356354067595ae27af9043b987bbf77bc0c8cf5c436232759e1533f3183ea0e10ee4508f846b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makeshape-doc"

RDEPENDS:${PN} += ""

inherit rpm
