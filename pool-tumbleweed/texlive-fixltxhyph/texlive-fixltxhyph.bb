SUMMARY = "Allow hyphenation of partially-emphasised substrings"
DESCRIPTION = "The package fixes the problem of TeX failing to hyphenate \
letter strings that seem (to TeX) to be words, but which are \
followed by an apostrophe and then an emphasis command. The \
cause of the problem is not the apostrophe, but the font change \
in the middle of the string. The problem arises in Catalan, \
French, Italian and Romansh."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn25832"

RPM_NAME = "texlive-fixltxhyph-2023.209.0.0.4svn25832-53.1.noarch.rpm"
RPM_HASH = "c252991b7b36a886180900f6f01be44bc75a063923c19c7a615f4ee896ebd369041a5e6fbeb7e18d2eb3b77777caa9ad16aafbc1884c28abb04b44de2dc936f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixltxhyph.sty \
texlive-fixltxhyph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
