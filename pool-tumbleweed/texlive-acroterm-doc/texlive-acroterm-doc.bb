SUMMARY = "Documentation for texlive-acroterm"
DESCRIPTION = "This package includes the documentation for texlive-acroterm"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn61719"

RPM_NAME = "texlive-acroterm-doc-2023.209.0.0.1svn61719-55.1.noarch.rpm"
RPM_HASH = "ac78373169e60de13907ea2ea940547fae187b0c1f015ba8a620dedbe9d94ae1b71b9d2e4a9823f1ec3fcb8ef1a99cc43736077a73242eacab3f96268d0ab80f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-acroterm-doc"

RDEPENDS:${PN} += ""

inherit rpm
