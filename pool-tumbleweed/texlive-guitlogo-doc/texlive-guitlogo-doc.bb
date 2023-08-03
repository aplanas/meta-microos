SUMMARY = "Documentation for texlive-guitlogo"
DESCRIPTION = "This package includes the documentation for texlive-guitlogo"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0_alpha.4svn55741"

RPM_NAME = "texlive-guitlogo-doc-2023.209.1.0.0_alpha.4svn55741-54.1.noarch.rpm"
RPM_HASH = "25d13ebd4a170ac542462b238c9b8fc3ccb361bb48634bd5a2c7165d96ce7581c51b4df4df2423e6a13ea44aeb560c34b5497800fc1fbc3660dc72336f060985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-guitlogo-doc-it \
texlive-guitlogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
