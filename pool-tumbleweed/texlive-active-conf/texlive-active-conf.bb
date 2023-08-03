SUMMARY = "Class for typesetting ACTIVE conference papers"
DESCRIPTION = "Active-conf is a class for typesetting papers for the Active \
conference on noise and vibration control. It is initially \
intended for the 2006 conference in Adelaide, Australia. The \
class is based on article with more flexible front-matter, and \
can be customised for conferences in future years with a header \
file."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3asvn15878"

RPM_NAME = "texlive-active-conf-2023.209.0.0.3asvn15878-55.1.noarch.rpm"
RPM_HASH = "ccc866d56a35021ec675f0f35674abe6d3c67d74acb18c518ed95d47de339d5f55e64ffd1cdf3a4085a5c8cda2f2bf96388190b1e714ac2a1d6f03f11ae56125"
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
