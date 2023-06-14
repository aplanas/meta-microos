SUMMARY = "Chemical hazard codes"
DESCRIPTION = "The r_und_s package decodes the german 'R- und S-Satze', which \
are numerically coded security advice for chemical substances \
into plain text. This is, e.g., used to compose security sheets \
or lab protocols and especially useful for students of \
chemistry. There are four packages, giving texts in German, \
English, French and Dutch."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3isvn15878"

RPM_NAME = "texlive-r_und_s-2023.201.1.3isvn15878-53.1.noarch.rpm"
RPM_HASH = "27ab95359251a04a7297ebe66e1194acf90f0d35d8950b3abeeb11e236ce310ed21841dd690e995b3dd267e7a54f05172bc791a13f01ad8f82a09fad674b80f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eng-rs.sty \
tex-eng-rs.tex \
tex-fr-rs.sty \
tex-fr-rs.tex \
tex-nl-rs.sty \
tex-nl-rs.tex \
tex-r-und-s.sty \
tex-r-und-s.tex \
texlive-r-und-s"

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
