SUMMARY = "A template for PRTEC conference papers"
DESCRIPTION = "This package provides a LaTeX class, a BibTeX style, and a \
LaTeX template to format conference papers for the Pacific Rim \
Thermal Engineering Conference (PRTEC). The .tex and .cls files \
are commented and should be self-explanatory. The package \
depends on newtx."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn51919"

RPM_NAME = "texlive-prtec-2023.209.1.06svn51919-53.1.noarch.rpm"
RPM_HASH = "e9ea2cd41398d2f8c0fb7947a0b2aa34ba6a0d248d4202b60aeab16ff3d47f8a8cbb2d2fef4d18854dfd6d3c02678bf87171551eef2a50f27def91f5eb4e8e4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prtec.cls \
texlive-prtec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-bm.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-dcolumn.sty \
tex-doi.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fnpos.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hologo.sty \
tex-hyperxmp.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-mathtools.sty \
tex-metalogo.sty \
tex-multicol.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-parskip.sty \
tex-subcaption.sty \
tex-textcase.sty \
tex-titlesec.sty \
tex-xcoffins.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
