SUMMARY = "Perl script to print DVI meta information"
DESCRIPTION = "The package provides a perl script which prints information \
about a DVI file. It also supports XeTeX XDV format."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn59216"

RPM_NAME = "texlive-dviinfox-2023.209.1.06svn59216-54.1.noarch.rpm"
RPM_HASH = "1aaa141955e75f7221d2a4534cc93254119111bacd4c4338a22c353072a937c1b2d24b2667b1804e3e8b19448516f67a3aa91b18d4fdc73bed5ac4d82c5962ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dviinfox"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-strict \
sed \
texlive \
texlive-dviinfox-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
