SUMMARY = "PdfTeX aliases for LuaTeX"
DESCRIPTION = "The package provides emulation of pdfTeX primitives for LuaTeX \
v0.85+."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.4svn41456"

RPM_NAME = "texlive-luatex85-2023.208.1.4svn41456-53.1.noarch.rpm"
RPM_HASH = "64c3a4186afe8b0ddd9e2cb2c1af4f165cb8cdd9d091a6646c375c6cbbc78fd6860a870c23a253edc88f1313b12b8b47dc01523e104baab563cc38d968aa0639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatex85.sty \
texlive-luatex85"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
