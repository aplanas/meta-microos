SUMMARY = "Computer Modern old-style arrows with smaller arrowheads"
DESCRIPTION = "This package provides Computer Modern old-style arrows with \
smaller arrowheads, associated with the usual LaTeX commands. \
It can be used in documents that contain other amssymb arrow \
characters that also have small arrowheads. It is also possible \
to use the usual new-style Computer Modern arrows together with \
the old-style ones."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn42872"

RPM_NAME = "texlive-old-arrows-2023.201.2.0svn42872-54.1.noarch.rpm"
RPM_HASH = "979e9f1e92b5effa8e924d6a23ddb86b745451e950a0aec0c3e0cd70f7da5dee8ad42cd02b2f9375c8e42c130190bf75f9868715f59fa06769bbea0090bbfa09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(oabsy10.tfm) \
tex(oabsy5.tfm) \
tex(oabsy6.tfm) \
tex(oabsy7.tfm) \
tex(oabsy8.tfm) \
tex(oabsy9.tfm) \
tex(oasy.enc) \
tex(oasy.map) \
tex(oasy10.tfm) \
tex(oasy5.tfm) \
tex(oasy6.tfm) \
tex(oasy7.tfm) \
tex(oasy8.tfm) \
tex(oasy9.tfm) \
tex(old-arrows.sty) \
texlive-old-arrows"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-old-arrows-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
