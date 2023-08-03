SUMMARY = "Typesetting units in LaTeX"
DESCRIPTION = "Many packages for typesetting units have been written for use \
in LaTeX2e. Some define macros to typeset a lot of units but do \
not suit to the actual font settings, some make the characters \
needed available but do not predefine any unit. This package \
tries to comply with both requirements. It predefines common \
units, defines an easy to use interface to define new units and \
changes the output concerning to the surrounding font settings."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-unitsdef-2023.209.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "e0a0267717a57c1acd7cea9f388276095df647917399b677a1fe681251dcb8b51fa3685b7ffd584ef6f405456c8ed15f3a96443cba2f6d3751e4d3a0cacada70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ampabbrv.cfg \
tex-enerabbr.cfg \
tex-freqabbr.cfg \
tex-lengabbr.cfg \
tex-molabbrv.cfg \
tex-timeabbr.cfg \
tex-unitsdef.sty \
tex-volabbrv.cfg \
tex-voltabbr.cfg \
tex-weigabbr.cfg \
texlive-unitsdef"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-fontenc.sty \
tex-textcomp.sty \
tex-units.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
