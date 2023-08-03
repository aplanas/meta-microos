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

RPM_NAME = "texlive-xistercian-2023.209.1.2svn61366-53.1.noarch.rpm"
RPM_HASH = "e5bf63fffda8a6c9556834a662cfe6adc17e88ac39abdc4b62a591b3d80c3b17d128cf56dc97ec2fdaf5c2a62d6c86a5ffbf9dc81edfe09a0c516f89aed579f2"
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
