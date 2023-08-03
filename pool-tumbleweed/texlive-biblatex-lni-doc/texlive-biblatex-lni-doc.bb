SUMMARY = "Documentation for texlive-biblatex-lni"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-lni"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn61719"

RPM_NAME = "texlive-biblatex-lni-doc-2023.209.0.0.5svn61719-54.1.noarch.rpm"
RPM_HASH = "5e5704a06801cb18a34add26f952a45e16364b73262d541f72d54598750db300c4f260e3b102727b62468027443285980add28868d5d979b1aa8a2bd248850d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-lni-doc"

RDEPENDS:${PN} += ""

inherit rpm
