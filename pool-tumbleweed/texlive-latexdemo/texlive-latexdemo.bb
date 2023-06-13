SUMMARY = "Demonstrate LaTeX code with its resulting output"
DESCRIPTION = "The package provides configurable tools to print out LaTeX code \
and the resulting output in the same document. It also supports \
printing the result inside a conditional sequence; thus one may \
suppress printing if the code would not compile."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn55265"

RPM_NAME = "texlive-latexdemo-2023.201.0.0.1svn55265-54.1.noarch.rpm"
RPM_HASH = "c1919bd4b6992dcc728b083058f534e389eb263fe8c4c16fcb093a6156761da3079b841304bbfd5ca7c713d0a579bddf97bcbc647e2c38b88013bff7c67e5674"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(latexdemo.sty) \
texlive-latexdemo"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(filecontents.sty) \
tex(framed.sty) \
tex(kvoptions-patch.sty) \
tex(kvoptions.sty) \
tex(listings.sty) \
tex(mdframed.sty) \
tex(pdftexcmds.sty) \
tex(xcolor.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
