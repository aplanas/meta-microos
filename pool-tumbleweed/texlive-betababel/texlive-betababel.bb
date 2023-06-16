SUMMARY = "Insert ancient greek text coded in Beta Code"
DESCRIPTION = "The betababel package extends the babel polutonikogreek option \
to provide a simple way to insert ancient Greek texts with \
diacritical characters into your document using the commonly \
used Beta Code transliteration. You can directly insert Beta \
Code texts -- as they can be found at the Perseus project, for \
example -- without modification."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn15878"

RPM_NAME = "texlive-betababel-2023.201.0.0.5svn15878-53.1.noarch.rpm"
RPM_HASH = "7ed95d2184e56fbf9192624b7012384b1c8040b1dc55e98b455b0946b0121afe18edc19f9df0202a7021a0fb904fac4688f18668e54a02b768ae4b3cf5ba98ff"
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
