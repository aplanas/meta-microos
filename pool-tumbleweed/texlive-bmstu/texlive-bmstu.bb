SUMMARY = "A LaTeX class for Bauman Moscow State Technical University"
DESCRIPTION = "The class defines commands and environments for creating \
reports and explanatory notes in Bauman Moscow State Technical \
University (Russia). Klass opredeliaet komandy i okruzheniia \
dlia sozdaniia otchetov i raschetno-poiasnitel'nykh zapisok v \
MGTU im. N. E. Baumana. Sgenerirovannye faily sootvetstvuiut \
trebovaniiam MGTU im. N. E. Baumanai GOST 7.32-2017. \
Raschetno-poiasnitel'nye zapiski k vypusknym kvalifikatsionnym \
rabotam uspeshno prokhodiat proverku TestVKR (sborka 203)."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn65897"

RPM_NAME = "texlive-bmstu-2023.201.2.0.0svn65897-52.1.noarch.rpm"
RPM_HASH = "312fee79978b36ead129f6de0a817c1a3a72bb4fe6b58c5c82bd999e9a2d3119a5f3183c4e758848eaeb4fba81e205e0b27d9bb719e542a12db56877b8f737cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bmstu-appendix.sty \
tex-bmstu-biblio.sty \
tex-bmstu-defabbr.sty \
tex-bmstu-essay.sty \
tex-bmstu-figure.sty \
tex-bmstu-listing.sty \
tex-bmstu-title.sty \
tex-bmstu-toc.sty \
tex-bmstu.cls \
texlive-bmstu"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-assoccnt.sty \
tex-babel.sty \
tex-booktabs.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-extreport.cls \
tex-fix-cm.sty \
tex-float.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-listings.sty \
tex-listingsutf8.sty \
tex-lscape.sty \
tex-microtype.sty \
tex-pgffor.sty \
tex-pgfplots.sty \
tex-setspace.sty \
tex-stackengine.sty \
tex-tabularx.sty \
tex-tikzscale.sty \
tex-titlesec.sty \
tex-totcount.sty \
tex-ulem.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
