SUMMARY = "Provides data about atomic nuclides for documents"
DESCRIPTION = "The package provides data and commands for including nuclear \
and atomic mass and energy data in LaTeX documents. It uses the \
PythonTeX package and requires pythontex.exe to be called with \
the TeX file as the argument."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47307"

RPM_NAME = "texlive-nucleardata-2023.201.1.1svn47307-54.1.noarch.rpm"
RPM_HASH = "15cf4a7c1553a5e1c18981094c0a1c60b44e8523584ec806ea00efcbd2145a68933d976e100c9e3ae6a087934e6c21074cf6ccdf23d6fb0d9575d2e93700956f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nucleardata.sty) \
texlive-nucleardata"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pythontex.sty) \
tex(siunitx.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
