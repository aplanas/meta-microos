SUMMARY = "COntent-Oriented LaTeX"
DESCRIPTION = "The package (COntent Oriented LaTeX) gives LaTeX the power to \
retain mathematical meaning of its expressions in addition to \
the typsetting instructions; essentially separating style from \
the content of the math. One advantage of keeping mathematical \
meaning is that conversion of LaTeX documents to other \
executable formats (such as Content MathML or Mathematica code) \
is greatly simplified. The package requires the coolstr, \
coollist and forloop packages."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.35svn15878"

RPM_NAME = "texlive-cool-2023.209.1.35svn15878-55.1.noarch.rpm"
RPM_HASH = "6325bd503cc7d96810915160a190733a65539c6c86ba235b128a6593176259400c0dc74c0fed053b884fe431964170f250b3c3b09915dac22b827f93afd6d3c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cool.sty \
texlive-cool"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-bbm.sty \
tex-coollist.sty \
tex-coolstr.sty \
tex-forloop.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
