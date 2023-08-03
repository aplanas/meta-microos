SUMMARY = "Analyse TeX logs"
DESCRIPTION = "This perl script allows the user to extract (and display) \
elements of the log file."
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.11svn54526"

RPM_NAME = "texlive-texloganalyser-2023.209.0.0.11svn54526-55.1.noarch.rpm"
RPM_HASH = "0c95f717285972e48d43522cbe9d1c6efc08ca1e11fa75a57230bd0d7c6f5d2e5cbada21e1be40336ae5f8d6e6d4ce59a92fe695db40f01a86181860bbdb6178"
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
