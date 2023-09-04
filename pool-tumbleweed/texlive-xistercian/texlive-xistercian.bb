SUMMARY = "Cistercian numerals in LaTeX"
DESCRIPTION = "xistercian allows you to use Cistercian numerals in LaTeX. The \
glyphs are created using PGF and to a certain degree \
configurable. You can use Cistercian numerals as page numbers \
using \\pagenumbering{cistercian}. The two main macros are: \
\\cistercian{<counter>} formats the LaTeX2e counter as a \
Cistercian numeral \\cisterciannum{<integer>} formats the \
integer (given as a string) as a Cistercian numeral"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61366"

RPM_NAME = "texlive-xistercian-2023.209.1.2svn61366-53.2.noarch.rpm"
RPM_HASH = "fb3e7c1bb66f2571c80133af7612ccc06a062e2b9ee691537b9ac183b959e887dfcde6f312c432e57d3f8bae681688dc689334ed71922977ef123810bca813f1"
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
