SUMMARY = "Define syntactic sugar for Unicode LaTeX"
DESCRIPTION = "The package allows the user to define shorthand aliases for \
single Unicode characters, and also provides support for such \
aliases in RTL-text. The package requires an TeX-alike system \
that uses Unicode input in a native way: current examples are \
XeTeX and LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.92svn22357"

RPM_NAME = "texlive-unisugar-2023.209.0.0.92svn22357-54.1.noarch.rpm"
RPM_HASH = "493c0ad397bc21e525c5e4742262040c3e1f8dc09a18631010cee9d74649ca9914d327ff8b4ff9ad38b94ce59e03dc02830336944c8291d16b49e7c64c41dbbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unisugar.sty \
texlive-unisugar"

RDEPENDS:${PN} += "/usr/bin/sh \
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
