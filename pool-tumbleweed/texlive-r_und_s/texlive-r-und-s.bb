SUMMARY = "Chemical hazard codes"
DESCRIPTION = "The r_und_s package decodes the german 'R- und S-Satze', which \
are numerically coded security advice for chemical substances \
into plain text. This is, e.g., used to compose security sheets \
or lab protocols and especially useful for students of \
chemistry. There are four packages, giving texts in German, \
English, French and Dutch."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3isvn15878"

RPM_NAME = "texlive-r_und_s-2023.209.1.3isvn15878-54.2.noarch.rpm"
RPM_HASH = "caa0b80f0fed6ba68a8eaf94ce6119a2094eedd2dde1ba4f2141f46371e58df16e337cae01b5e4b034f1ae92c15831085bd8c4bea20bb899c31ea591c047edc6"
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
