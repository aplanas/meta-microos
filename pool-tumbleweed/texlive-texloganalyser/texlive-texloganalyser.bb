SUMMARY = "Analyse TeX logs"
DESCRIPTION = "This perl script allows the user to extract (and display) \
elements of the log file."
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.11svn54526"

RPM_NAME = "texlive-texloganalyser-2023.201.0.0.11svn54526-54.1.noarch.rpm"
RPM_HASH = "fa775c17e627d94c36e23f660f158a932ce1b3d82ee899c5c3a28cd1d6bd3eac10c40affc41a794ae070f408a71b769b71576ad30e60c70e4141b05868dadbd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texloganalyser"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texloganalyser-bin"

inherit rpm
