SUMMARY = "Experimental bidi presentation"
DESCRIPTION = "A great portion of the code is borrowed from the texpower \
bundle, with modifications to get things working properly in \
both right to left and left to right modes."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn35267"

RPM_NAME = "texlive-bidipresentation-2023.209.0.0.3svn35267-54.1.noarch.rpm"
RPM_HASH = "5c529a17fcb502041fe053fc07150d6b20342b2ce339841c8aa58b55be9e48d0ac67abe207583d4680aa29b294856f9b219bc7a2427105ea1a5b367d732da109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bidiprescolors.cfg \
tex-bidipresentation.cls \
texlive-bidipresentation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-calc.sty \
tex-color.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-scrlfile.sty \
tex-xecolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
