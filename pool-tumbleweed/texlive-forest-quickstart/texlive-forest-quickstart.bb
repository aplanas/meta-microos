SUMMARY = "Quickstart Guide for Linguists package 'forest'"
DESCRIPTION = "forest is a PGF/TikZ-based package for drawing linguistic (and \
other kinds of) trees. This manual provides a quickstart guide \
for linguists with just the essential things that you need to \
get started."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.svn55688"

RPM_NAME = "texlive-forest-quickstart-2023.201.svn55688-52.1.noarch.rpm"
RPM_HASH = "9e8926f5e3dd5c9a5e0bf9cd074b23f1609f2127689f2a9a18bd0895bafdf6fd00312210d7f3fb767fe49408db5b0b0b86f2c6132abb067803926d95b502d404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forest-quickstart"

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
