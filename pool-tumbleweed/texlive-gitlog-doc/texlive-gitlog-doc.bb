SUMMARY = "Documentation for texlive-gitlog"
DESCRIPTION = "This package includes the documentation for texlive-gitlog"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.betasvn38932"

RPM_NAME = "texlive-gitlog-doc-2023.201.0.0.0.betasvn38932-53.2.noarch.rpm"
RPM_HASH = "21ca4ba4222d82d1e49971390a5c1fee5c1f09900511678f8131f7643ca9f6af74c0706bcb6533d2b9672d07005e90ac6cf1f4d9950a4787a875ead10af7c424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitlog-doc"

RDEPENDS:${PN} += ""

inherit rpm
