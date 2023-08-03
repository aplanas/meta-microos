SUMMARY = "Define macros with sophisticated options"
DESCRIPTION = "The package provides a means of defining macros whose options \
are taken from a dictionary, which includes options which \
themselves have arguments. The package was designed for use \
with Plain TeX; its syntax derives from that of the \\hbox, \
\\hrule, etc., TeX primitives."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn23567"

RPM_NAME = "texlive-getoptk-2023.209.1.0svn23567-53.1.noarch.rpm"
RPM_HASH = "8ad4c8ce0c6b341f5dd45b238fa7cab7f34974c8d150378e89fcc947c9794a8db10d562b7db5646ca804513c72a744bf2076dbe9e315abf835021bb0d1641750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-getoptk.tex \
tex-guide.tex \
texlive-getoptk"

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
