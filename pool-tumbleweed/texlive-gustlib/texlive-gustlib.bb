SUMMARY = "Plain macros for much core and extra functionality, from GUST"
DESCRIPTION = "Includes bibliography support, token manipulation, \
cross-references, verbatim, determining length of a paragraph's \
last line, multicolumn output, Polish bibliography and index \
styles, prepress and color separation, graphics manipulation, \
tables."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-gustlib-2023.201.svn54074-53.2.noarch.rpm"
RPM_HASH = "0ed6fa70873c31481fe0f9cdad25f851a06c5de5c9759428c0b9727d8ff0089dc133e43693661c73b100a29bc76fa7b634f46b71b09cd029fb08434c9494090f"
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
