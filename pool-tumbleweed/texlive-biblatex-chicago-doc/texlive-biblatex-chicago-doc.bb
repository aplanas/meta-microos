SUMMARY = "Documentation for texlive-biblatex-chicago"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-chicago"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3asvn65037"

RPM_NAME = "texlive-biblatex-chicago-doc-2023.209.2.3asvn65037-54.1.noarch.rpm"
RPM_HASH = "68818548cbf8eccb7f6cc90c828614fab6c20502453549712bf6e2d303508c2f94a9ab644e19835d503bdbeda23a72e2a5fb53d255d6eff4963ed011d7bb7d52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-chicago-doc"

RDEPENDS:${PN} += ""

inherit rpm
