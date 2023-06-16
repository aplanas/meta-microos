SUMMARY = "Class for typesetting ACTIVE conference papers"
DESCRIPTION = "Active-conf is a class for typesetting papers for the Active \
conference on noise and vibration control. It is initially \
intended for the 2006 conference in Adelaide, Australia. The \
class is based on article with more flexible front-matter, and \
can be customised for conferences in future years with a header \
file."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3asvn15878"

RPM_NAME = "texlive-active-conf-2023.201.0.0.3asvn15878-54.1.noarch.rpm"
RPM_HASH = "83b4ecb3328b3616d8320f969fc1c610ca769b3b7bc4576a2abe59596e6c2c26b10f65bac74bf1bf3bb38a6bcfd12514a10d23b09bd574f7281fcfbaf077a49c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-active-conf.cls \
texlive-active-conf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-article.cls \
tex-bm.sty \
tex-calc.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-textcomp.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
