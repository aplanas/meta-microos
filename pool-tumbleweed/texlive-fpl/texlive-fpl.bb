SUMMARY = "SC and OsF fonts for URW Palladio L"
DESCRIPTION = "The FPL Fonts provide a set of SC/OsF fonts for URW Palladio L \
which are compatible with respect to metrics with the Palatino \
SC/OsF fonts from Adobe. Note that it is not my aim to exactly \
reproduce the outlines of the original Adobe fonts. The SC and \
OsF in the FPL Fonts were designed with the glyphs from URW \
Palladio L as starting point. For some glyphs (e.g. 'o') I got \
the best result by scaling and boldening. For others (e.g. 'h') \
shifting selected portions of the character gave more \
satisfying results. All this was done using the free font \
editor FontForge. The kerning data in these fonts comes from \
Walter Schmidt's improved Palatino metrics. LaTeX use is \
enabled by the mathpazo package, which is part of the psnfss \
distribution."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.003svn54512"

RPM_NAME = "texlive-fpl-2023.209.1.003svn54512-53.1.noarch.rpm"
RPM_HASH = "dc44fbd6905f8b7e5855d52f305f514aae320bea6e9714a31fcbc3d745562c3a0dc45ed5dc56f3d780bf45b36c595a85d654fa4784f403fcf7172d6ce711b2da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fpl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-fpl-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
