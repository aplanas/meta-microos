SUMMARY = "Producing multiple indices"
DESCRIPTION = "This package enables the user to produce and typeset one or \
more indices simultaneously. The package is known to work in \
LaTeX documents processed with pdfLaTeX, XeLaTeX and LuaLaTeX. \
If makeindex is used for processing the index entries, no \
particular setup is needed when TeX Live is used. Using xindy \
or other programs, it is necessary to enable shell escape. \
Shell escape is also needed if splitindex is used. This is a \
fork of imakeidx, with new features and fixed bugs."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.1svn38931"

RPM_NAME = "texlive-indextools-2023.209.1.5.1svn38931-54.1.noarch.rpm"
RPM_HASH = "23a2fd41d3a090bd6ae0b15e317e09adf61928ccfcb6a6014da69f82b713d5ed942ee35ae7774a1eb58855653761fed846fb618718f657383b9194672e9dcf98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-indextools.sty \
texlive-indextools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-letltxmacro.sty \
tex-multicol.sty \
tex-pdftexcmds.sty \
tex-xkeyval.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
