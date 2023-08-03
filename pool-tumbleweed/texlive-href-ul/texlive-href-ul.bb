SUMMARY = "Underscored LaTeX hyperlinks"
DESCRIPTION = "This LaTeX package makes hyperlinks underscored, just like on \
the web. The package uses hyperref and ulem."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn64880"

RPM_NAME = "texlive-href-ul-2023.209.0.0.3.0svn64880-54.1.noarch.rpm"
RPM_HASH = "90c94f53f7f0853845680843644e80f742f6b4e50d32b64a1122e9ce650052c061f0031d1b61bcd49e5fa8f70237a30735b64365fd789b2f9f6fbed7874ce176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-href-ul.sty \
texlive-href-ul"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-hyperref \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-ulem"

inherit rpm
