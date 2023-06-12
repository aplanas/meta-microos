SUMMARY = "Framed boxes for Plain TeX"
DESCRIPTION = "A jiffy file (taken from fancybox) for placing a frame around a \
box of text. The macros also provide for typesetting an empty \
box of given dimensions."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn18312"

RPM_NAME = "texlive-frame-2023.201.1.0svn18312-52.1.noarch.rpm"
RPM_HASH = "3cea9e25c8d415ac9c8794d93550ed7efd0481e52e1ff64be7f042c6577c0abf8ab77f9fed16c037f11d394a0cde65b53e0d51f31a6d930285b0a3279c1033b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(frame.sty) \
tex(frame.tex) \
texlive-frame"
RDEPENDS:${PN} += "/bin/sh \
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
