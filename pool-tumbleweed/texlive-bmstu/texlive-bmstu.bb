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

PV = "2023.209.2.0.0svn65897"

RPM_NAME = "texlive-bmstu-2023.209.2.0.0svn65897-53.1.noarch.rpm"
RPM_HASH = "cd889f85d6b8da645fe4723d2f525230b656b412c0de58371c8735d82ffd1bad9157741fb0d97d6b801c23ef1d6bb68cc54c9fa2d034c3c120059a4c72b1774f"
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

RDEPENDS:${PN} += "/usr/bin/sh \
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
