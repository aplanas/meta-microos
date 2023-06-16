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

PV = "2023.201.1.003svn54512"

RPM_NAME = "texlive-fpl-2023.201.1.003svn54512-52.1.noarch.rpm"
RPM_HASH = "33cfeacc5f866565a36ff1af47f49790574bbbf0156f4d1f77b7a24b6299f8e7a4aac39d1de84d05ec883bc791b92c5e5ecf3002740b226c4a0cabd7c8d8ddc5"
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
