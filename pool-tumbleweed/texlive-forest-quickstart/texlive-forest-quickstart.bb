SUMMARY = "Quickstart Guide for Linguists package 'forest'"
DESCRIPTION = "forest is a PGF/TikZ-based package for drawing linguistic (and \
other kinds of) trees. This manual provides a quickstart guide \
for linguists with just the essential things that you need to \
get started."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.svn55688"

RPM_NAME = "texlive-forest-quickstart-2023.209.svn55688-53.1.noarch.rpm"
RPM_HASH = "f86ec3354b0b6d24fd85352d373a347325f2f72cdb03b34b5f3fa855a1b0021384d55c7eb25542e5802ca006a928f6c11af25e5076e34ab915f31fbeb4fb58e2"
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
