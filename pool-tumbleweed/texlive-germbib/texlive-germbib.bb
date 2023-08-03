SUMMARY = "German variants of standard BibTeX styles"
DESCRIPTION = "A development of the (old) german.sty, this bundle provides \
German packages, BibTeX styles and documentary examples, for \
writing documents with bibliographies. The author has since \
developed the babelbib bundle, which (he asserts) supersedes \
germbib."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-germbib-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "582beea3e3437a1fcf1ddabd784d54184f33f3b19ac9c3184321d640234f09d6badbe0d2d4a49ae0e1dddd1eec09de9e1a17206a37790fcd49794a0554d5dfc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibgerm.sty \
tex-mynormal.sty \
texlive-germbib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-german.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
