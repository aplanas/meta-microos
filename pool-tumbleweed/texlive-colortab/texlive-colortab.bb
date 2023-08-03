SUMMARY = "Shade cells of tables and halign"
DESCRIPTION = "The package lets you shade or colour the cells in the alignment \
environments such as \\halign and LaTeX's tabular and array \
environments. The colortbl package is to be preferred today \
with LaTeX (it assures compatibility with the longtable \
package, which is no longer true with colortab); another modern \
option is the table-colouring option of the xcolor. However, \
colortab remains an adequate solution for use with Plain TeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn22155"

RPM_NAME = "texlive-colortab-2023.209.1.0svn22155-54.1.noarch.rpm"
RPM_HASH = "854d105e86cea52085dd335e58db82f925fb56ba6d1801095fa88d149c5d48c0951952e5be1cda98dd14552c205bec67b16b68c5b7643ed691a5d64c979b33fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colortab.sty \
tex-colortab.tex \
texlive-colortab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancybox.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
