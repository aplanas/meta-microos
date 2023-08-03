SUMMARY = "Class files for the Journal of Machine Learning Research"
DESCRIPTION = "The jmlr bundle provides a class for authors (jmlr) and a class \
for production editors (jmlrbook). The jmlrbook class can be \
used to combine articles written using the jmlr class into a \
book. The class uses the combine class and the hyperref package \
to produce either a colour hyperlinked book for on-line viewing \
or a greyscale nonhyperlinked book for printing. Production \
editors can use makejmlrbookgui to help build the proceedings \
from the articles."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.30svn61957"

RPM_NAME = "texlive-jmlr-2023.209.1.30svn61957-56.1.noarch.rpm"
RPM_HASH = "ebfc6258b9aa0033688d38c78bc853f4ab731f2575696095839660924ea7be7094256c0b804438d3252a2596e8decb73a67f14293ebb2b7174cc81f6137f9618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jmlr.cls \
tex-jmlrbook.cls \
tex-jmlrutils.sty \
texlive-jmlr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm2e.sty \
tex-aliascnt.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-article.cls \
tex-calc.sty \
tex-cleveref.sty \
tex-combnat.sty \
tex-currfile.sty \
tex-etoolbox.sty \
tex-fink.sty \
tex-glyphtounicode-cmr.tex \
tex-glyphtounicode.tex \
tex-graphicx.sty \
tex-hyperref.sty \
tex-nameref.sty \
tex-natbib.sty \
tex-placeins.sty \
tex-setspace.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xmpincl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
