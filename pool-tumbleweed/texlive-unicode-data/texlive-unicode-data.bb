SUMMARY = "Unicode data and loaders for TeX"
DESCRIPTION = "This bundle provides generic access to Unicode Consortium data \
for TeX use. It contains a set of text files provided by the \
Unicode Consortium which are currently all from Unicode 8.0.0, \
with the exception of MathClass.txt which is not currently part \
of the Unicode Character Database. Accompanying these source \
data are generic TeX loader files allowing this data to be used \
as part of TeX runs, in particular in building format files. \
Currently there are two loader files: one for general character \
set up and one for initialising XeTeX character classes as has \
been carried out to date by unicode-letters.tex. The source \
data are distributed in accordance with the license stipulated \
by the Unicode Consortium. The bundle as a whole is \
co-ordinated by the LaTeX3 Project as a general resource for \
TeX users."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.16svn64423"

RPM_NAME = "texlive-unicode-data-2023.201.1.16svn64423-53.1.noarch.rpm"
RPM_HASH = "23a3e64511db6afafe306b2c58283166d85d2c248df27a77a9c27da0d9f3140e8bb8f271c750c01702777d715b4ad5753178ce53b183d22e4f161c4a4ac78952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(load-unicode-data.tex) \
tex(load-unicode-math-classes.tex) \
tex(load-unicode-xetex-classes.tex) \
texlive-unicode-data"

RDEPENDS:${PN} += "/bin/sh \
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
