SUMMARY = "Typeset miller indices"
DESCRIPTION = "Typeset miller indices, e.g., <1-20>, that are used in material \
science with an easy syntax. Minus signs are printed as bar \
above the corresponding number."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn18789"

RPM_NAME = "texlive-miller-2023.209.1.2svn18789-55.1.noarch.rpm"
RPM_HASH = "368cc9bb164a293cf00ce476f7870b59219c9eb93d4d3e981780d0b8d0cd08cacb29a2cc3fbf747d75ab8152c5489c434e2f6306ce83cdbc8f30e68469c32377"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-miller.sty \
texlive-miller"

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
