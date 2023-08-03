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

PV = "2023.209.svn15878"

RPM_NAME = "texlive-pdfslide-2023.209.svn15878-52.1.noarch.rpm"
RPM_HASH = "184fe8d2d36bfbd2df5b94bee2df19060087bcf02947c0c351eb5db419ceea285511d9f47decf4b730707d218540a2d183e921124a795a20d021f95e6f8a2ad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfslide.cfg \
tex-pdfslide.sty \
tex-slide.clo \
texlive-pdfslide"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbsy.sty \
tex-amssymb.sty \
tex-colortbl.sty \
tex-fancybox.sty \
tex-graphicx.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
