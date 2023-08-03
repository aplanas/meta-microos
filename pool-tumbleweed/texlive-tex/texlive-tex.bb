SUMMARY = "A sophisticated typesetting engine"
DESCRIPTION = "TeX is a typesetting system that incorporates a macro \
processor. A TeX source document specifies or incorporates a \
number of macro definitions that instruct the TeX engine how to \
typeset the document. The TeX engine also uses font metrics \
generated by Metafont, or by any of several other mechanisms \
that incorporate fonts from other sources into an environment \
suitable for TeX. TeX has been, and continues, a basis and an \
inspiration for several other programs, including e-TeX and \
PDFTeX. The distribution includes the source of Knuth's TeX \
book; this source is there to read, as an example of writing \
TeX -- it should not be processed without Knuth's direct \
permission."
LICENSE = "SUSE-TeX"

PV = "2023.209.3.141592653svn66186"

RPM_NAME = "texlive-tex-2023.209.3.141592653svn66186-55.1.noarch.rpm"
RPM_HASH = "a3aee5dec439e874ce8c721f8762eef6c9e574ccea0705102292f6b31ad4f4d3d919cb351b45b6adcecc046e99ee738a9b17dbeee7553768ed275fa373d23029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-initex.1 \
man-tex.1 \
texlive-tex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
tex-null.tex \
texlive \
texlive-amsfonts \
texlive-cm \
texlive-cm-super \
texlive-ec \
texlive-epsf \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-manfnt \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-bin"

inherit rpm
