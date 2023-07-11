SUMMARY = "Documentation for texlive-realscripts"
DESCRIPTION = "This package includes the documentation for texlive-realscripts"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3dsvn56594"

RPM_NAME = "texlive-realscripts-doc-2023.201.0.0.3dsvn56594-53.2.noarch.rpm"
RPM_HASH = "5bb2fe391c27099b04a67ba5e127a1bb56fc3122994564e2b6bbb7f3d905ff04ad023f3fce75a873ca57cfcaf97d4ac2b484d693d9d80b45958ca3bdd74f9726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realscripts-doc"

RDEPENDS:${PN} += ""

inherit rpm
