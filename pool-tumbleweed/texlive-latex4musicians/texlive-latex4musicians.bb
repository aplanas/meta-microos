SUMMARY = "A guide for combining LaTeX and music"
DESCRIPTION = "This guide, 'LaTeX for Musicians', explains how to create LaTeX \
documents that include several kinds of music elements: music \
symbols, song lyrics, guitar chords diagrams, lead sheets, \
music excerpts, guitar tablatures, multi-page scores."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.1.0.1svn49759"

RPM_NAME = "texlive-latex4musicians-2023.209.1.0.1svn49759-55.1.noarch.rpm"
RPM_HASH = "180c49a211406263caf87ee9d7699d997fe88a842941f43bc9d65f625f25ab7a5368b82ab1384e2bcfb63409bd72412f5c0c2a3a01010832e31f7559c5631cad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex4musicians"

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
