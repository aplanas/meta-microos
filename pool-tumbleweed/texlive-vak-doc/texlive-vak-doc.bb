SUMMARY = "Documentation for texlive-vak"
DESCRIPTION = "This package includes the documentation for texlive-vak"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23431"

RPM_NAME = "texlive-vak-doc-2023.201.svn23431-53.1.noarch.rpm"
RPM_HASH = "1106f8e50e47924429bd93906d9b131825413cfc996039a3e134b8c22360634c1d6f246723acb3d8ad7df4200037550656eede008c56bb0c4f20c409fcd84d67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-vak-doc:en) \
texlive-vak-doc"
RDEPENDS:${PN} += ""

inherit rpm
