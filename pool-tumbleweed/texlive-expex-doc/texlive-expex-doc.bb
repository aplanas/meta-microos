SUMMARY = "Documentation for texlive-expex"
DESCRIPTION = "This package includes the documentation for texlive-expex"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.1bsvn44499"

RPM_NAME = "texlive-expex-doc-2023.209.5.1bsvn44499-53.1.noarch.rpm"
RPM_HASH = "bef045ff088c738b4e810fd8b9733ccac9e658f21345d8749ff36daf6f3848aa5bbeac32e3d8823b9ffe35c2612f409af29ce83e4401103462e2b74be6307693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expex-doc"

RDEPENDS:${PN} += ""

inherit rpm
