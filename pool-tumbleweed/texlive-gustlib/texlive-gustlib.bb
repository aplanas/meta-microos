SUMMARY = "Plain macros for much core and extra functionality, from GUST"
DESCRIPTION = "Includes bibliography support, token manipulation, \
cross-references, verbatim, determining length of a paragraph's \
last line, multicolumn output, Polish bibliography and index \
styles, prepress and color separation, graphics manipulation, \
tables."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-gustlib-2023.209.svn54074-54.1.noarch.rpm"
RPM_HASH = "e3762a759bf15449d3a842504b2efe2f0eb3638ed63a9887aae0176044f22ec949a109d376deef663bae4e00d1d628b36c5d65d7d9a1b91e7f7215381b4c8eda"
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
