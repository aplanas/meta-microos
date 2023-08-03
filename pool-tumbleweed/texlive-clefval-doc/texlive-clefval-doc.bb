SUMMARY = "Documentation for texlive-clefval"
DESCRIPTION = "This package includes the documentation for texlive-clefval"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn55985"

RPM_NAME = "texlive-clefval-doc-2023.209.0.0.1svn55985-54.1.noarch.rpm"
RPM_HASH = "24f3b7ea93e87333b2f7eb7daa789cf8e02af24c18767764f647c59e8f2032cbfc083a28d4543dee3fe247cf1bdf9b8cabf3821ca468404812917bb200a596ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-clefval-doc-fr \
texlive-clefval-doc"

RDEPENDS:${PN} += ""

inherit rpm
