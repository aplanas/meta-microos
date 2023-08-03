SUMMARY = "Draw Metafont/post pictures from (La)TeX commands"
DESCRIPTION = "Mfpic is a scheme for producing pictures from (La)TeX commands. \
Commands \\mfpic and \\endmfpic (in LaTeX, the mfpic environment) \
enclose a group in which drawing commands may be placed. The \
commands generate a Meta-language file, which may be processed \
by MetaPost (or even Metafont). The resulting image file will \
be read back in to the document to place the picture at the \
point where the original (La)TeX commands appeared. Note that \
the ability to use MetaPost here means that the package works \
equally well in LaTeX and pdfLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn28444"

RPM_NAME = "texlive-mfpic-2023.209.1.10svn28444-55.1.noarch.rpm"
RPM_HASH = "67073921c0586faa50a761dd0d062b62bcbb7caf7d00211094aee2bcb6423ac1e7134d96e3673da850f14c03dc2cb39b5657b35a7d05e9c8e5c520d88d70da8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mfpic.sty \
tex-mfpic.tex \
tex-mfpicdef.tex \
texlive-mfpic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
