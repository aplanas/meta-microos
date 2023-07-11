SUMMARY = "Chemical hazard codes"
DESCRIPTION = "The r_und_s package decodes the german 'R- und S-Satze', which \
are numerically coded security advice for chemical substances \
into plain text. This is, e.g., used to compose security sheets \
or lab protocols and especially useful for students of \
chemistry. There are four packages, giving texts in German, \
English, French and Dutch."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3isvn15878"

RPM_NAME = "texlive-r_und_s-2023.201.1.3isvn15878-53.2.noarch.rpm"
RPM_HASH = "9226005b50ff7dbb0b9d33d566a606d79a8dfe7641898a58537bb19153a728de1dd6c2710a57760fd9fb67c408833a281901ded8595e7e042cf9f85ff7070f83"
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
