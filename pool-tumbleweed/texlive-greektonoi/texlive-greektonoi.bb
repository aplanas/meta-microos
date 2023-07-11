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

RPM_NAME = "texlive-greektonoi-2023.201.svn39419-53.2.noarch.rpm"
RPM_HASH = "bc1415fb5360f9e807415fe920f0f377a05c3e9df02280dbbe2ceee7d820ee017b8e30f86bd69ae6065d6d4bf6ea0bdc322b9ba4d824a390ca6a5bb264a98574"
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
