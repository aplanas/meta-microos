SUMMARY = "Simple, typographic beamer theme"
DESCRIPTION = "Arguelles is a beamer theme that helps you create beautiful \
presentations. It aims for simplicity and readability by \
following best practices of graphic design. The layout is \
elegant but subtle, so as to keep the audience's attention on \
your content. This is brought to life by Alegreya, one of the \
53 Fonts of the Decade selected by the Association \
Typographique Internationale (2011)."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.0svn66358"

RPM_NAME = "texlive-beamertheme-arguelles-2023.201.2.1.0svn66358-53.1.noarch.rpm"
RPM_HASH = "f71aa722a31cf4cbb659e531ffddac081ab552f471f947087924292e4a6ad8da89515e020c9de54f40087d3d14f57b293582e6abcc95a203bb5e0e9476f62e3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemeArguelles.sty) \
tex(beamerfontthemeArguelles.sty) \
tex(beamerinnerthemeArguelles.sty) \
tex(beamerouterthemeArguelles.sty) \
tex(beamerthemeArguelles.sty) \
texlive-beamertheme-arguelles"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(Alegreya.sty) \
tex(AlegreyaSans.sty) \
tex(booktabs.sty) \
tex(cancel.sty) \
tex(colortbl.sty) \
tex(csvsimple.sty) \
tex(dcolumn.sty) \
tex(enumitem.sty) \
tex(eulervm.sty) \
tex(fontawesome5.sty) \
tex(fontenc.sty) \
tex(inputenc.sty) \
tex(makecell.sty) \
tex(mathalpha.sty) \
tex(microtype.sty) \
tex(opencolor.sty) \
tex(parskip.sty) \
tex(pgfplots.sty) \
tex(tikz.sty) \
tex(ulem.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
