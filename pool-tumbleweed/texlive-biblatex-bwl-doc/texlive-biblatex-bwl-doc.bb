SUMMARY = "Documentation for texlive-biblatex-bwl"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-bwl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn26556"

RPM_NAME = "texlive-biblatex-bwl-doc-2023.209.0.0.02svn26556-54.1.noarch.rpm"
RPM_HASH = "58ef4d1fb5712060744f19c59b36083a71758dc360b20c5a7287e69794e2c28901177e413c0d63648639d6e621869fb6e108b3d9d192b5a786a1e39ad606b73c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-bwl-doc"

RDEPENDS:${PN} += ""

inherit rpm
