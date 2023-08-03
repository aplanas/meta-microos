SUMMARY = "Documentation for texlive-tikz-ladder"
DESCRIPTION = "This package includes the documentation for texlive-tikz-ladder"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn62992"

RPM_NAME = "texlive-tikz-ladder-doc-2023.209.1.3svn62992-53.1.noarch.rpm"
RPM_HASH = "23e769318c8cb5dd68df874dff2c79cd3a5602128f47e9cb1c036941f009145fe50bdbb5ff5db7fc492ce094d5e481baaf669a26d992f8518b86d86d9774637f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-ladder-doc"

RDEPENDS:${PN} += ""

inherit rpm
