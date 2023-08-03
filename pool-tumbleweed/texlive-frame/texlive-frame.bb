SUMMARY = "Framed boxes for Plain TeX"
DESCRIPTION = "A jiffy file (taken from fancybox) for placing a frame around a \
box of text. The macros also provide for typesetting an empty \
box of given dimensions."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn18312"

RPM_NAME = "texlive-frame-2023.209.1.0svn18312-53.1.noarch.rpm"
RPM_HASH = "35634b1408efea483acf26c55eba3ca12ef88c40672d1a324c071a6a08611343a5b1b63b06ea3a4135f01e465c161187f24292bbad5891fb1375e95330382ee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frame.sty \
tex-frame.tex \
texlive-frame"

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
