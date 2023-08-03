SUMMARY = "Documentation for texlive-biblatex-manuscripts-philology"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-manuscripts-philology"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.2svn53344"

RPM_NAME = "texlive-biblatex-manuscripts-philology-doc-2023.209.2.1.2svn53344-54.1.noarch.rpm"
RPM_HASH = "22f452c7aec551304487455365bef7e69582e4ae5b712776f4652b1a5819ac3b03fa2a3edd35cb45d76f3b2cf147e2f5bb7ba1608731f155e47470ccd0445096"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-manuscripts-philology-doc"

RDEPENDS:${PN} += ""

inherit rpm
