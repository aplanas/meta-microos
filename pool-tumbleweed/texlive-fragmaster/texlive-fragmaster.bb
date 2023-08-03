SUMMARY = "Using psfrag with pdfLaTeX"
DESCRIPTION = "Fragmaster enables you to use psfrag with pdfLaTeX. It takes \
EPS files and psfrag substitution definition files, and \
produces PDF and EPS files with the substitutions included."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.6svn26313"

RPM_NAME = "texlive-fragmaster-2023.209.1.6svn26313-53.1.noarch.rpm"
RPM_HASH = "b38aadeaab6401b50c245af1c44be63a13cd480ec8bfa75d1545f7b1205086ba755d7573b7a032259f888f37968ce36a7868094a22c9bce1bd69cca12fd1c524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fragmaster"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Temp \
perl-Pod--Usage \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-fragmaster-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
