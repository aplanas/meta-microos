SUMMARY = "Plain macros for much core and extra functionality, from GUST"
DESCRIPTION = "Includes bibliography support, token manipulation, \
cross-references, verbatim, determining length of a paragraph's \
last line, multicolumn output, Polish bibliography and index \
styles, prepress and color separation, graphics manipulation, \
tables."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-gustlib-2023.209.svn54074-54.2.noarch.rpm"
RPM_HASH = "57d8e1096e045917d9d3a775106b4d700916590058fd7905625818f4ed9b16962a377a4e674a2e88b82d72a6683295eac1901494cb94ff3731f1a87dbd636d7a"
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
