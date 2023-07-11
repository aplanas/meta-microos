SUMMARY = "Cistercian numerals in LaTeX"
DESCRIPTION = "xistercian allows you to use Cistercian numerals in LaTeX. The \
glyphs are created using PGF and to a certain degree \
configurable. You can use Cistercian numerals as page numbers \
using \\pagenumbering{cistercian}. The two main macros are: \
\\cistercian{<counter>} formats the LaTeX2e counter as a \
Cistercian numeral \\cisterciannum{<integer>} formats the \
integer (given as a string) as a Cistercian numeral"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61366"

RPM_NAME = "texlive-xistercian-2023.201.1.2svn61366-52.2.noarch.rpm"
RPM_HASH = "b5c6b4024ceb93cd5d9636d6b0cecec4857de39b3d7ae95e70f55025dee3bfd975e465d0d01d65ce67fbd3ab90f3668199665292ca298b397c3036209c49e048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xistercian.sty \
texlive-xistercian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expkv-opt.sty \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
