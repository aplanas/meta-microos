SUMMARY = "Documentation for texlive-gamebooklib"
DESCRIPTION = "This package includes the documentation for texlive-gamebooklib"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn63424"

RPM_NAME = "texlive-gamebooklib-doc-2023.209.1.3svn63424-53.1.noarch.rpm"
RPM_HASH = "834515c9aa1cad76e80ff05950a90b771e0011c0822ad888c4fc919e5d22afb656c6c680c74afd6900a8a4d3f52e53b472e961ea1f7f6d21d56de092ed9a1955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gamebooklib-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
