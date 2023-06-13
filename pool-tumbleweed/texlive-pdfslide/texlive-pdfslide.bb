SUMMARY = "Presentation slides using pdfTeX"
DESCRIPTION = "This is a package for use with pdfTeX, to make nice \
presentation slides. Its aims are: to devise a method for \
easier technical presentation; to help the mix of mathematical \
formulae with text and graphics which other present day \
document processing tools fail to accomplish; to exploit the \
platform independence of TeX so that presentation documents \
become portable; and to offer the freedom and possibilities of \
using various backgrounds and other embellishments that a user \
can imagine to have in as presentation. The package can make \
use of the facilities of the PPower4 post-processor."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-pdfslide-2023.201.svn15878-51.1.noarch.rpm"
RPM_HASH = "b63330156f18c35fcd4863095bd7b38c89dd8b9c3ce406b31dd695a5142b82fa55404cf3aceee524bf3550babda18b1a1e5b4b4abed26630c7c6693e0f248ab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfslide.cfg) \
tex(pdfslide.sty) \
tex(slide.clo) \
texlive-pdfslide"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsbsy.sty) \
tex(amssymb.sty) \
tex(colortbl.sty) \
tex(fancybox.sty) \
tex(graphicx.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
