SUMMARY = "Insert ancient greek text coded in Beta Code"
DESCRIPTION = "The betababel package extends the babel polutonikogreek option \
to provide a simple way to insert ancient Greek texts with \
diacritical characters into your document using the commonly \
used Beta Code transliteration. You can directly insert Beta \
Code texts -- as they can be found at the Perseus project, for \
example -- without modification."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn15878"

RPM_NAME = "texlive-betababel-2023.209.0.0.5svn15878-54.1.noarch.rpm"
RPM_HASH = "b5abd27c37d4f12de6013b0f1ed00882f3100534b3c52ffe85ab7af30ef232197b7de60d555f32034ac2c667133ec8411ae8fcda46387959a96705eb73191893"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-betababel.sty \
texlive-betababel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-teubner.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
