SUMMARY = "Documentation for texlive-tikzducks"
DESCRIPTION = "This package includes the documentation for texlive-tikzducks"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn55713"

RPM_NAME = "texlive-tikzducks-doc-2023.209.1.5svn55713-53.1.noarch.rpm"
RPM_HASH = "2e0a11ea22d8fc0a51fdb9569e68f4dfc9b4db6bd920e56f8dd80b77235db199449a32df51abc60d2392bace8117a2e44272ecac72774ecf2d978436123714e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzducks-doc"

RDEPENDS:${PN} += ""

inherit rpm
