SUMMARY = "Documentation for texlive-tikzfill"
DESCRIPTION = "This package includes the documentation for texlive-tikzfill"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn63947"

RPM_NAME = "texlive-tikzfill-doc-2023.209.1.0.0svn63947-53.1.noarch.rpm"
RPM_HASH = "1378473f74dbe0d9f7146b579b665788e40a89437e191f27a0cfc8fc58e5fcd74a85fcf08087b309be5e6eaffc348600ac183b58dc15f0a45f14b039eb339427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzfill-doc"

RDEPENDS:${PN} += ""

inherit rpm
