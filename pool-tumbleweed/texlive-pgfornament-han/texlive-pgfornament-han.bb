SUMMARY = "Pgfornament library for Chinese traditional motifs and patterns"
DESCRIPTION = "This package provides a pgfornament library for Chinese \
traditional motifs and patterns. The command \\pgfornamenthan \
takes the same options as \\pgfornament from the pgfornament \
package, but renders Chinese traditional motifs instead. The \
list of supported motifs, as well as some examples, can be \
found in the accompanying documentation. Yi pgfornament Hong \
Bao De Ji Zhi ,Shi Xian Hui Zhi Yi Feng Tu Wen . \
\\pgfornamenthan He \\pgfornament De Can Shu Shi Yi Yang De ;Bian \
Yi De Chu Lai De Dang Ran Shi Yi Feng Wen Yang Liao . Hong Bao \
Shou Ce Li You Wan Zheng De Wen Yang Lie Biao Yi Ji Shi Yong \
Fan Li ."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54191"

RPM_NAME = "texlive-pgfornament-han-2023.201.svn54191-51.1.noarch.rpm"
RPM_HASH = "c88882e1e3292bead9e2b093b575625e3c45b0f14de055e327362e6161d595e07a20ba07a49fbca04d7396ca9194f82751b727a403099b5b8c9b2244372dc239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemeHeavenlyClouds.sty \
tex-beamerthemeXiaoshan.sty \
tex-cncolours.sty \
tex-pgflibraryhan.code.tex \
tex-pgfornament-han.sty \
texlive-pgfornament-han"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-needspace.sty \
tex-pgfmath.sty \
tex-pgfornament.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
