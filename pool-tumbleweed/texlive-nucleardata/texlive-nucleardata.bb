SUMMARY = "Provides data about atomic nuclides for documents"
DESCRIPTION = "The package provides data and commands for including nuclear \
and atomic mass and energy data in LaTeX documents. It uses the \
PythonTeX package and requires pythontex.exe to be called with \
the TeX file as the argument."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47307"

RPM_NAME = "texlive-nucleardata-2023.209.1.1svn47307-55.1.noarch.rpm"
RPM_HASH = "b98d3fbb2d6b5179f6f17b17f62bff0af4244052cca96c59ce9df87fd048f96a36c990d3cf680ff4ee5b8f0de0dcff08a53a9cab45c5b18d22f2b0a7b22ef733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nucleardata.sty \
texlive-nucleardata"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pythontex.sty \
tex-siunitx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
