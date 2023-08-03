SUMMARY = "Documentation for texlive-pst-layout"
DESCRIPTION = "This package includes the documentation for texlive-pst-layout"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.95svn29803"

RPM_NAME = "texlive-pst-layout-doc-2023.209.0.0.95svn29803-53.1.noarch.rpm"
RPM_HASH = "53162271ab0fff3605f161a4acffb26402341042b14f9cf8363910d60295390a4d411f80de1b1fa71530f32c719649928521f9878c4c7bfd6cf214c13c1865b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-layout-doc"

RDEPENDS:${PN} += ""

inherit rpm
