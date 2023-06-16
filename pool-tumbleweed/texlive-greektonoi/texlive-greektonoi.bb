SUMMARY = "Facilitates writing/editing of multiaccented greek"
DESCRIPTION = "The greektonoi mapping extends the betababel package or the \
babel polutonikogreek option to provide a simple way to insert \
ancient Greek texts with diacritical characters into your \
document using a similar method to the commonly used Beta Code \
transliteration, but with much more freedom. It is designed \
especially for the XeTeX engine and it could also be used for \
fast and easy modification of monotonic greek texts to \
polytonic. The output text is natively encoded in Unicode, so \
it can be reused in any possible way. The greektonoi package \
provides, in addition to inserting greek accents and \
breathings, many other symbols used in greek numbers and \
arithmetic or in the greek archaic period. It could be used \
with greektonoi mapping or indepedently."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.svn39419"

RPM_NAME = "texlive-greektonoi-2023.201.svn39419-53.1.noarch.rpm"
RPM_HASH = "8ca879852e7bfdefca594efb083feb3d63971a44c273a8f79e7cb385b0c7104549cf39fc4078f2ebcdfcd38aee1e48bfa567670ad58ff88d9d87f3498e46cf66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-greektonoi.map \
tex-greektonoi.sty \
texlive-greektonoi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
