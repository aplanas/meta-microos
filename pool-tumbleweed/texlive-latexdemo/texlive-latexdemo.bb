SUMMARY = "Demonstrate LaTeX code with its resulting output"
DESCRIPTION = "The package provides configurable tools to print out LaTeX code \
and the resulting output in the same document. It also supports \
printing the result inside a conditional sequence; thus one may \
suppress printing if the code would not compile."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn55265"

RPM_NAME = "texlive-latexdemo-2023.209.0.0.1svn55265-55.1.noarch.rpm"
RPM_HASH = "2db7b0c0ce31626e37534a8528b2f42f735e7da104e5a3e2efe7607e6742b3653d8b0326dfaf8adee1f47d08b087615c960d40d1f875a08fdf53d827f3ff6635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latexdemo.sty \
texlive-latexdemo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-filecontents.sty \
tex-framed.sty \
tex-kvoptions-patch.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-mdframed.sty \
tex-pdftexcmds.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
