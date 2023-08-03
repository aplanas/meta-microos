SUMMARY = "A class for small advertisements"
DESCRIPTION = "The class enables you to create the sort of adverts that you \
pin on a noticeboard, with tear-off strips at the bottom where \
you can place contact details."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0001svn25915"

RPM_NAME = "texlive-petiteannonce-2023.209.1.0001svn25915-52.1.noarch.rpm"
RPM_HASH = "a38a7256491d389d1780217f08a8a1bfb96b599804435f8ca63b9b3fe39485fa28bf00bb46f31731fe95ed196071a30b33937fa5bf20e8f60a83ded01b8cda72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-petiteannonce.cls \
texlive-petiteannonce"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
