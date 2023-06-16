SUMMARY = "Texinfo documentation system"
DESCRIPTION = "Texinfo is the preferred format for documentation in the GNU \
project; the format may be used to produce online or printed \
output from a single source. The Texinfo macros may be used to \
produce printable output using TeX; other programs in the \
distribution offer online interactive use (with hypertext \
linkages in some cases). The latest release of the texinfo.tex \
macros and texi2dvi script may be found in the texinfo-latest \
package, which are usually newer than the last full release."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.6.8svn66354"

RPM_NAME = "texlive-texinfo-2023.201.6.8svn66354-54.1.noarch.rpm"
RPM_HASH = "6f09405fd3b998e92f5515971377a8fdbe1ddcefe39a4f48d0ad3d05f91566163e5f53ba9ec1853d80edb33419c8c3154f0329ca3c36957659fb91126b69b920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texinfo.tex \
tex-txi-cs.tex \
tex-txi-de.tex \
tex-txi-en.tex \
tex-txi-es.tex \
tex-txi-fr.tex \
tex-txi-it.tex \
tex-txi-nb.tex \
tex-txi-nl.tex \
tex-txi-nn.tex \
tex-txi-pl.tex \
tex-txi-pt.tex \
tex-txi-ru.tex \
tex-txi-sr.tex \
tex-txi-tr.tex \
tex-txi-uk.tex \
texlive-texinfo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-amsfonts \
texlive-cm-super \
texlive-ec \
texlive-epsf \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
