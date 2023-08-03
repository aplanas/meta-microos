SUMMARY = "Extend the standard classes' size options"
DESCRIPTION = "Provides classes extarticle, extreport, extletter, extbook and \
extproc which provide for documents with a base font size from \
8-20pt. There is also a LaTeX package, extsizes.sty, which can \
be used with nonstandard document classes. But it cannot be \
guaranteed to work with any given class."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4asvn17263"

RPM_NAME = "texlive-extsizes-2023.209.1.4asvn17263-53.1.noarch.rpm"
RPM_HASH = "b5f6bc8b55980f1e66c94df4099e30b141db1b9ca3f6681de67ff8a86c84a1a75985d67d5aa0d1376c59c055d4dfc84f82c53ad06cf06b31cae3fe2c03906d06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autopagewidth.sty \
tex-extarticle.cls \
tex-extbook.cls \
tex-extletter.cls \
tex-extproc.cls \
tex-extreport.cls \
tex-extsizes.sty \
tex-size14.clo \
tex-size17.clo \
tex-size20.clo \
tex-size8.clo \
tex-size9.clo \
texlive-extsizes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-exscale.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
