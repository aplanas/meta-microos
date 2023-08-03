SUMMARY = "Documentation for texlive-latexbug"
DESCRIPTION = "This package includes the documentation for texlive-latexbug"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0nsvn63596"

RPM_NAME = "texlive-latexbug-doc-2023.209.1.0nsvn63596-55.1.noarch.rpm"
RPM_HASH = "3ce8316ab26068edfc32a709730bb29ace9585179df2c7d06e236fd1bc5606b2fa1c64a0e4051b1bf719cfb78245b4670d0939e041dd565d0ad4e2ce0b0311d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexbug-doc"

RDEPENDS:${PN} += ""

inherit rpm
