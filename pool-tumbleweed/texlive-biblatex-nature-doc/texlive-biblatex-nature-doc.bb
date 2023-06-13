SUMMARY = "Documentation for texlive-biblatex-nature"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-nature"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3dsvn57262"

RPM_NAME = "texlive-biblatex-nature-doc-2023.201.1.3dsvn57262-53.1.noarch.rpm"
RPM_HASH = "3eb541a56116f3543c56582156812f87f275ee494f8d4ebe3e5e7d993dcc9c082fbea3d6e95532519f0154e92481d2e285aa8b2cb2b68ed703185c3a5aeb75ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-nature-doc"

RDEPENDS:${PN} += ""

inherit rpm
