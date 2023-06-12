SUMMARY = "Documentation for texlive-overlock"
DESCRIPTION = "This package includes the documentation for texlive-overlock"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64495"

RPM_NAME = "texlive-overlock-doc-2023.201.svn64495-51.1.noarch.rpm"
RPM_HASH = "91af0aee91335b34ec09ff55a3b481b2e9eb94695e41fe5b67615522a05038231d3d60f909a685f980b39bfa6f17b4408fc9580d75ea1047534d4e4920165c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-overlock-doc"
RDEPENDS:${PN} += ""

inherit rpm
