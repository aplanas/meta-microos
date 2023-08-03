SUMMARY = "Documentation for texlive-biblatex-nature"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-nature"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3dsvn57262"

RPM_NAME = "texlive-biblatex-nature-doc-2023.209.1.3dsvn57262-54.1.noarch.rpm"
RPM_HASH = "0611b421e512cb94d40c7c0372eda6e6047e51d401e435897ac121f4fb5f6108767e540149127378113eb2d99a331dd6c1db503d7f9014e2ca7089b125a0c88d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-nature-doc"

RDEPENDS:${PN} += ""

inherit rpm
