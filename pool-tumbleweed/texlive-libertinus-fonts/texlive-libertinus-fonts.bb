SUMMARY = "The Libertinus font family"
DESCRIPTION = "This is a fork of the Linux Libertine and Linux Biolinum fonts \
that started as an OpenType math companion of the Libertine \
font family, but grown as a full fork to address some of the \
bugs in the fonts. The family consists of: Libertinus Serif: \
forked from Linux Libertine. Libertinus Sans: forked from Linux \
Biolinum. Libertinus Mono: forked from Linux Libertine Mono. \
Libertinus Math: an OpenType math font for use in OpenType \
math-capable applications like LuaTeX, XeTeX or MS Word 2007+."
LICENSE = "OFL-1.1"

PV = "2023.209.7.040svn57948"

RPM_NAME = "texlive-libertinus-fonts-2023.209.7.040svn57948-55.1.noarch.rpm"
RPM_HASH = "61a5758b52d969c1ca883118018058526097af4b555341f5e3fc74c0f9afc491e106b1f68aee3c296a22617ad655221bd7b8fe7ecc94d8ca221377e8275a7f45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinus-fonts"

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
texlive-libertinus-fonts-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
