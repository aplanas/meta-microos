SUMMARY = "Documentation for texlive-srbtiks"
DESCRIPTION = "This package includes the documentation for texlive-srbtiks"
LICENSE = "OFL-1.1"

PV = "2023.209.1.0svn63308"

RPM_NAME = "texlive-srbtiks-doc-2023.209.1.0svn63308-58.1.noarch.rpm"
RPM_HASH = "3d4f4a808be56c193fd36fcd6dc93e7c7f70fc73061a1a1b4cbacbb16bbdb70c66d51a743fbf0e25f862a0af63b74e9fb9c620062c5b92b64ef3e985dfdfeab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-srbtiks-doc"

RDEPENDS:${PN} += ""

inherit rpm
