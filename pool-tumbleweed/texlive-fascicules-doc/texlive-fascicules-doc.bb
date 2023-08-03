SUMMARY = "Documentation for texlive-fascicules"
DESCRIPTION = "This package includes the documentation for texlive-fascicules"
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn54080"

RPM_NAME = "texlive-fascicules-doc-2023.209.1svn54080-53.1.noarch.rpm"
RPM_HASH = "9317af01bdd9ebb4eaa420b2eac90ff339b7fba3d1e2a6d7d74e3d08466fbfa5d326c28e01046d1e9a5feffdeb76d43288a1113c8e7bdfd3da8d66f9880fc943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fascicules-doc-fr \
texlive-fascicules-doc"

RDEPENDS:${PN} += ""

inherit rpm
