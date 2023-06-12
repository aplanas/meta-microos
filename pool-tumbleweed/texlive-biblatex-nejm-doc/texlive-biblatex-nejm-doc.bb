SUMMARY = "Documentation for texlive-biblatex-nejm"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-nejm"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5.0svn49839"

RPM_NAME = "texlive-biblatex-nejm-doc-2023.201.0.0.5.0svn49839-53.1.noarch.rpm"
RPM_HASH = "1a8eb5c366cc5b8bcb3b9f2fbcc2634ca043fffe38cfd9526935e7b34ee36d5231c9b23395490f2997aaae59f99ba3069bdb34ac1d0f4f1e586e804531ffed71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-nejm-doc"
RDEPENDS:${PN} += ""

inherit rpm
