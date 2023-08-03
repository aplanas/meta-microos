SUMMARY = "Provide hooks to be run on every page of a document"
DESCRIPTION = "The package provides hooks to perform actions on every page, or \
on the current page. Specifically, actions are performed after \
the page is composed, but before it is shipped, so they can be \
used to prepare the output page in tasks like putting \
watermarks in the background, or in setting the next page \
layout, etc."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn56694"

RPM_NAME = "texlive-everypage-2023.209.2.0bsvn56694-53.1.noarch.rpm"
RPM_HASH = "b44e31f9b08bac8edc766923c592c59ff2565a309de950f1c7a6c9d1fc81e3b857afabded46d2e02f6513943e18e46614cd91e66b3b2e86b3da68eca1558e1a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-everypage-1x.sty \
tex-everypage.sty \
texlive-everypage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
