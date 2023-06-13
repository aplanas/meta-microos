SUMMARY = "Three series of mathematical symbols"
DESCRIPTION = "Mathabx is a set of 3 mathematical symbols font series: matha, \
mathb and mathx. They are defined by Metafont code and should \
be of reasonable quality (bitmap output). Things change from \
time to time, so there is no claim of stability (encoding, \
metrics, design). The package includes Plain TeX and LaTeX \
support macros. A version of the fonts, in Adobe Type 1 format, \
is also available."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-mathabx-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "ccc844f009d98e0623d271615d644679012cd98f6e7d131a15d1ad9f199eddb7e2ec381875b65e1590c95a184c4b9c60fbde3eabedd295630042534444c40aae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(matha10.tfm) \
tex(matha12.tfm) \
tex(matha5.tfm) \
tex(matha6.tfm) \
tex(matha7.tfm) \
tex(matha8.tfm) \
tex(matha9.tfm) \
tex(mathabx.sty) \
tex(mathabx.tex) \
tex(mathastrotest10.tfm) \
tex(mathb10.tfm) \
tex(mathb12.tfm) \
tex(mathb5.tfm) \
tex(mathb6.tfm) \
tex(mathb7.tfm) \
tex(mathb8.tfm) \
tex(mathb9.tfm) \
tex(mathc10.tfm) \
tex(mathu10.tfm) \
tex(mathux10.tfm) \
tex(mathx10.tfm) \
tex(mathx12.tfm) \
tex(mathx5.tfm) \
tex(mathx6.tfm) \
tex(mathx7.tfm) \
tex(mathx8.tfm) \
tex(mathx9.tfm) \
texlive-mathabx"

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
