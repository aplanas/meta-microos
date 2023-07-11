SUMMARY = "Documentation for texlive-infwarerr"
DESCRIPTION = "This package includes the documentation for texlive-infwarerr"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.5svn53023"

RPM_NAME = "texlive-infwarerr-doc-2023.208.1.5svn53023-53.1.noarch.rpm"
RPM_HASH = "994b68e188235296a0a506fa878ed5cd12b5e64ad82019e2250d36b00ba37ee73d984f741431ae5ef4efd6b18d5d156191206f88c81cdb7d2b61df8b500a8f2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-infwarerr-doc"

RDEPENDS:${PN} += ""

inherit rpm
