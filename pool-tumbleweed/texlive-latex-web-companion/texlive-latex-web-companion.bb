SUMMARY = "Examples from The LaTeX Web Companion"
DESCRIPTION = "The source of the examples printed in the book, together with \
necessary supporting files."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29349"

RPM_NAME = "texlive-latex-web-companion-2023.209.svn29349-55.1.noarch.rpm"
RPM_HASH = "c2ddacc1c94998a41ebbd35d56e5b0a3975067d5fbe57ef38908409ae47d74f79deb651cbd0879ce7bdebee63ee01c8797c5ee8bc4f9325c09be396107832c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SGMLS \
perl-SGMLS--Output \
perl-SGMLS--Refs \
perl-SGMLS-Attribute \
perl-SGMLS-Element \
perl-SGMLS-Entity \
perl-SGMLS-Event \
perl-SGMLS-Notation \
texlive-latex-web-companion"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
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
