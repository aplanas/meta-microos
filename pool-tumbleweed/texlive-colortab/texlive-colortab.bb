SUMMARY = "Shade cells of tables and halign"
DESCRIPTION = "The package lets you shade or colour the cells in the alignment \
environments such as \\halign and LaTeX's tabular and array \
environments. The colortbl package is to be preferred today \
with LaTeX (it assures compatibility with the longtable \
package, which is no longer true with colortab); another modern \
option is the table-colouring option of the xcolor. However, \
colortab remains an adequate solution for use with Plain TeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn22155"

RPM_NAME = "texlive-colortab-2023.201.1.0svn22155-53.1.noarch.rpm"
RPM_HASH = "c3487f129f822840c412144c3d412a30509587d0796d8acb2f642c6cb09f7276d65f975204076b07b0314c2ac1845ddbac8a83b3b615c4641391a049c0dab456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(colortab.sty) \
tex(colortab.tex) \
texlive-colortab"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fancybox.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
