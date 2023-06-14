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

PV = "2023.201.1.5.1svn38931"

RPM_NAME = "texlive-indextools-2023.201.1.5.1svn38931-52.1.noarch.rpm"
RPM_HASH = "b1bbf2be14e243ea6b2065082ab461e47b8635107e823bb532d3c252eb3d37bba96699e5819c55cfc45c5481a3607b8116e4310099d8b33ef2a51b5857c2e28a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-indextools.sty \
texlive-indextools"

RDEPENDS:${PN} += "/bin/sh \
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
