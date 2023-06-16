SUMMARY = "Plain macros for much core and extra functionality, from GUST"
DESCRIPTION = "Includes bibliography support, token manipulation, \
cross-references, verbatim, determining length of a paragraph's \
last line, multicolumn output, Polish bibliography and index \
styles, prepress and color separation, graphics manipulation, \
tables."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-gustlib-2023.201.svn54074-53.1.noarch.rpm"
RPM_HASH = "9f6b58eba3b22bad42ea955d1b13ef0231d8b6ce4814476d06afa16a0f80d13e124a87e62951af31cb877eb8f04dc442599bac3df08401f3dbe57fb319d7f2da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblotex.tex \
tex-infr-ex.tex \
tex-infram.tex \
tex-map.tex \
tex-mcol-ex.tex \
tex-meashor.tex \
tex-mimulcol.tex \
tex-plidxmac.tex \
tex-przyklad.tex \
tex-rbox-ex.tex \
tex-roundbox.tex \
tex-split.tex \
tex-tp-crf.tex \
tex-tsp.tex \
tex-tun.tex \
tex-verbatim-dek.tex \
texlive-gustlib"

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
