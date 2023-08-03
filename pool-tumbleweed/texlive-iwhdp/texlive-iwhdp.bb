SUMMARY = "Halle Institute for Economic Research (IWH) Discussion Papers"
DESCRIPTION = "The document class is for creating Discussion Papers of the \
Halle Institute for Economic Research (IWH) in Halle, Germany. \
The class offers options for both English and German texts."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.50svn37552"

RPM_NAME = "texlive-iwhdp-2023.209.0.0.50svn37552-56.1.noarch.rpm"
RPM_HASH = "d3ed489e1287fc116d08d1bddb205537eb75e3860446d501a93e35e3e3992c58c0fc347be45722242b60f47b583f5f26b91fcde95dee3744f992e2ee9d55663a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iwhdp.cls \
texlive-iwhdp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-babel.sty \
tex-booktabs.sty \
tex-color.sty \
tex-csquotes.sty \
tex-datenumber.sty \
tex-dcolumn.sty \
tex-float.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-lineno.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-lscape.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-pdfpages.sty \
tex-pifont.sty \
tex-rotating.sty \
tex-sansmath.sty \
tex-setspace.sty \
tex-suffix.sty \
tex-textcomp.sty \
tex-textpos.sty \
tex-universalis.sty \
tex-wallpaper.sty \
tex-xifthen.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
