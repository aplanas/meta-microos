SUMMARY = "Document class for COSI Problem sets at Brandeis University (Waltham, MA)"
DESCRIPTION = "Brandeis University's computer science ('COSI') courses often \
assign 'problem sets' which require fairly rigorous formatting. \
This document class, which extends article, provides a simple \
way to typeset these problem sets in LaTeX. Although the class \
is compatible with all LaTeX flavors, XeLaTeX or LuaLaTeX are \
recommended for fontspec support."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5.5svn50991"

RPM_NAME = "texlive-brandeis-problemset-2023.209.0.0.5.5svn50991-53.1.noarch.rpm"
RPM_HASH = "904c955b92f166e3283ec05476b808d5b52c1e7f45cc84893fb2eed48cf139e9232904bbb7000bf7c09339e2205347567826b5b2fe31e9c24282d0439b00cf47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-brandeis-problemset.cls \
tex-brandeis-problemset.sty \
texlive-brandeis-problemset"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-article.cls \
tex-booktabs.sty \
tex-calc.sty \
tex-changepage.sty \
tex-comment.sty \
tex-couriers.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-fp.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-longtable.sty \
tex-mathtools.sty \
tex-multirow.sty \
tex-stix2.sty \
tex-tabu.sty \
tex-tikz.sty \
tex-titletoc.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
