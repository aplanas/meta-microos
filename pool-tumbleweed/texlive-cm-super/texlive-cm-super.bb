SUMMARY = "CM-Super family of fonts"
DESCRIPTION = "The CM-Super family provides Adobe Type 1 fonts that replace \
the T1/TS1-encoded Computer Modern (EC/TC), T1/TS1-encoded \
Concrete, T1/TS1-encoded CM bright and LH Cyrillic fonts (thus \
supporting all European languages except Greek), and bringing \
many ameliorations in typesetting quality. The fonts exhibit \
the same metrics as the Metafont-encoded originals."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-cm-super-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "d872c0208c693166d18f4240d1b9d8957594b59759c24122698f0c7ce1901baa3fc080a5374695f21fd4473d6fee04bbe12452aaec007fe2ab2c1d2328d20568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cm-super-t1.enc \
tex-cm-super-t1.map \
tex-cm-super-t2a.enc \
tex-cm-super-t2a.map \
tex-cm-super-t2b.enc \
tex-cm-super-t2b.map \
tex-cm-super-t2c.enc \
tex-cm-super-t2c.map \
tex-cm-super-ts1.enc \
tex-cm-super-ts1.map \
tex-cm-super-x2.enc \
tex-cm-super-x2.map \
tex-type1ec.sty \
texlive-cm-super"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-t1cmr.fd \
tex-updmap.cfg \
texlive \
texlive-cm-super-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
