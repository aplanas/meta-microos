SUMMARY = "Documentation for texlive-biblatex-nottsclassic"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-nottsclassic"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn41596"

RPM_NAME = "texlive-biblatex-nottsclassic-doc-2023.209.0.0.1svn41596-54.1.noarch.rpm"
RPM_HASH = "80b18ac1dc71255c393ae3c002f503e4f6226df61c67432ffdd7cb207f8f593e1f360957f142ee8515842a060aa1f7bce974d1165b2e5ce439f7db1d338e1ee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-nottsclassic-doc"

RDEPENDS:${PN} += ""

inherit rpm
