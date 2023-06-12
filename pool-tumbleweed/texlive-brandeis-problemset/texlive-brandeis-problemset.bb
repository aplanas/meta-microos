SUMMARY = "Document class for COSI Problem sets at Brandeis University (Waltham, MA)"
DESCRIPTION = "Brandeis University's computer science ('COSI') courses often \
assign 'problem sets' which require fairly rigorous formatting. \
This document class, which extends article, provides a simple \
way to typeset these problem sets in LaTeX. Although the class \
is compatible with all LaTeX flavors, XeLaTeX or LuaLaTeX are \
recommended for fontspec support."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5.5svn50991"

RPM_NAME = "texlive-brandeis-problemset-2023.201.0.0.5.5svn50991-52.1.noarch.rpm"
RPM_HASH = "0024fe8811df9cca2f575c84bb4157e02dab887c63abe6d4792d3de96a8abbde92f704591d2a642ae4f291e3452320082e3ae27b7910e86ed9bfdeb7ece0dbd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(brandeis-problemset.cls) \
tex(brandeis-problemset.sty) \
texlive-brandeis-problemset"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(article.cls) \
tex(booktabs.sty) \
tex(calc.sty) \
tex(changepage.sty) \
tex(comment.sty) \
tex(couriers.sty) \
tex(enumitem.sty) \
tex(fancyhdr.sty) \
tex(fontspec.sty) \
tex(fp.sty) \
tex(hyperref.sty) \
tex(kvoptions.sty) \
tex(listings.sty) \
tex(longtable.sty) \
tex(mathtools.sty) \
tex(multirow.sty) \
tex(stix2.sty) \
tex(tabu.sty) \
tex(tikz.sty) \
tex(titletoc.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
