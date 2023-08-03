SUMMARY = "Documentation for texlive-biblatex-cv"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-cv"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn59433"

RPM_NAME = "texlive-biblatex-cv-doc-2023.209.0.0.01svn59433-54.1.noarch.rpm"
RPM_HASH = "f39705aae8475c425d55ed1943ee074795533f2a917a52a35d22328c5466e377817a93ad8b995903826a9c579e698b1d6fa93b6ae65f277995dba97c3d81512b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-cv-doc"

RDEPENDS:${PN} += ""

inherit rpm
