SUMMARY = "Bibliography style for Chalmers University of Technology"
DESCRIPTION = "The package, heavily based on the harvard package for \
Harvard-style citations, provides a citation suite for students \
at Chalmers University of Technology that follows given \
recommendations."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.9999svn28552"

RPM_NAME = "texlive-chscite-2023.209.2.9999svn28552-54.1.noarch.rpm"
RPM_HASH = "a7e7e2e795d859f62a67307037cff125bcbd1d87cc8d5943ef92f52451f4b958332bc6e1150313f1b500698499f6d16cf77fe37a96a036a954c2c6fb967e4e91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chscite.sty \
texlive-chscite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
