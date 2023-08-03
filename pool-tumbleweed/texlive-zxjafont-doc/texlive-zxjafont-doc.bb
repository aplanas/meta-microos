SUMMARY = "Documentation for texlive-zxjafont"
DESCRIPTION = "This package includes the documentation for texlive-zxjafont"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn62864"

RPM_NAME = "texlive-zxjafont-doc-2023.209.1.3svn62864-53.1.noarch.rpm"
RPM_HASH = "b28b297e9e42fa8e398e5ac318cac29ba9b09c5d82688bbc65bd604404feadd29605c8c0707e0a60ed020450319c322ff4739cafc48d4444f329a3b278ebdfc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zxjafont-doc-ja;en \
texlive-zxjafont-doc"

RDEPENDS:${PN} += ""

inherit rpm
