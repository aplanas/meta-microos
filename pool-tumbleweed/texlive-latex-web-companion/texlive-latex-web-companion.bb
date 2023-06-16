SUMMARY = "Examples from The LaTeX Web Companion"
DESCRIPTION = "The source of the examples printed in the book, together with \
necessary supporting files."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29349"

RPM_NAME = "texlive-latex-web-companion-2023.201.svn29349-54.1.noarch.rpm"
RPM_HASH = "7f6540c1e4615ba448af69ea7b13a88cb7d88b9c85176acc3627afef76838c1f3dc87a336d0920f545c6874a3ec2c012fbeab9bd7d8b3bd1384a3dc7463677d5"
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
