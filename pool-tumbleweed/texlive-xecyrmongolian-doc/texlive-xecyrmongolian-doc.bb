SUMMARY = "Documentation for texlive-xecyrmongolian"
DESCRIPTION = "This package includes the documentation for texlive-xecyrmongolian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn53160"

RPM_NAME = "texlive-xecyrmongolian-doc-2023.201.1.0svn53160-52.1.noarch.rpm"
RPM_HASH = "3634867c9b72cb63e94a14e44d4837a2fcf5700a0176fc643fc675341f6693c15443a1ff6292d4eaef40b633e2fdfcdc12be36d19902a487afff53a0254b6979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xecyrmongolian-doc"

RDEPENDS:${PN} += ""

inherit rpm
