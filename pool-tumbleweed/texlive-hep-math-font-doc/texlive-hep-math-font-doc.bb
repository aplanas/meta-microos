SUMMARY = "Documentation for texlive-hep-math-font"
DESCRIPTION = "This package includes the documentation for texlive-hep-math-font"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64901"

RPM_NAME = "texlive-hep-math-font-doc-2023.209.1.1svn64901-54.2.noarch.rpm"
RPM_HASH = "886c78dec99ef61f9da9cc56cc7d582d82521f2e75f36fdb71a88f4bafd29ea8d7838cb212cf75b9abb788a980bf194a715d612d85f2d242c89ad05ff8419ef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-math-font-doc"

RDEPENDS:${PN} += ""

inherit rpm
