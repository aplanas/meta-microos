SUMMARY = "A language definition file for Mongolian in Babel"
DESCRIPTION = "This package provides support for Mongolian in a Cyrillic \
alphabet. (The work derives from the earlier Russian work for \
babel.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-mongolian-babel-2023.201.1.2svn15878-54.1.noarch.rpm"
RPM_HASH = "290f7bfd69071bfe7960f29e8779729cbf9bdf81b8a9aea55440d539f5e8280788e58c10909e82cca48e4d2856d534a77d5449a55d5236baac20e047e4a21fdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mn.def \
tex-mongolian.ldf \
tex-mongolian.sty \
texlive-mongolian-babel"

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
