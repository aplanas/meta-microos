SUMMARY = "A guide for combining LaTeX and music"
DESCRIPTION = "This guide, 'LaTeX for Musicians', explains how to create LaTeX \
documents that include several kinds of music elements: music \
symbols, song lyrics, guitar chords diagrams, lead sheets, \
music excerpts, guitar tablatures, multi-page scores."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.1.0.1svn49759"

RPM_NAME = "texlive-latex4musicians-2023.201.1.0.1svn49759-54.1.noarch.rpm"
RPM_HASH = "885642ef1ff6aa1d258f21dd718a7fc454d61d668f3103415977da367459315241e5122544716d3717211ea99f2e57ec08826355d1285b7c8ae26f519404f6e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex4musicians"
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
