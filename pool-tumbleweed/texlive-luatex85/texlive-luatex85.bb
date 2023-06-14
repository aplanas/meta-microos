SUMMARY = "PdfTeX aliases for LuaTeX"
DESCRIPTION = "The package provides emulation of pdfTeX primitives for LuaTeX \
v0.85+."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn41456"

RPM_NAME = "texlive-luatex85-2023.201.1.4svn41456-52.1.noarch.rpm"
RPM_HASH = "ed02d39ddb197407bc5963804621f65a7b6ace75fc7cc3ea880cfa53a4c6c8adb7d7f15c22eff65e16e5d4ef14168cd4acb07a39835957a6d03ef4653a8cc168"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatex85.sty \
texlive-luatex85"

RDEPENDS:${PN} += "/bin/sh \
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
