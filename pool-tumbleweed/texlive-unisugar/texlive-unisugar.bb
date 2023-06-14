SUMMARY = "Define syntactic sugar for Unicode LaTeX"
DESCRIPTION = "The package allows the user to define shorthand aliases for \
single Unicode characters, and also provides support for such \
aliases in RTL-text. The package requires an TeX-alike system \
that uses Unicode input in a native way: current examples are \
XeTeX and LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.92svn22357"

RPM_NAME = "texlive-unisugar-2023.201.0.0.92svn22357-53.1.noarch.rpm"
RPM_HASH = "898263d3aa5dc062e4a431f95f0ea80052b27f73179b20d3f8c32c22c2b9eff5fe6abb71b58738cf703ca1cc5ebd259681bc56ace0d5e5e0c3de395a65c0b735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unisugar.sty \
texlive-unisugar"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifxetex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
