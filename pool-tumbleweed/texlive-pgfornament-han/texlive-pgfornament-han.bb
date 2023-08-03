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

PV = "2023.209.svn54191"

RPM_NAME = "texlive-pgfornament-han-2023.209.svn54191-52.1.noarch.rpm"
RPM_HASH = "c87059db8a333b59efce3a26c9beddffc72727510b6feda9b77da0c41b93ffec737d036fd98f091682a487c28a436649271c71fe4939324e3f0275f5744e7b7c"
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
