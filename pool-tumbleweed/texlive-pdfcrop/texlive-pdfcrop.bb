SUMMARY = "Crop PDF graphics"
DESCRIPTION = "A Perl script that can either trim pages of any whitespace \
border, or trim them of a fixed border."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.40svn55435"

RPM_NAME = "texlive-pdfcrop-2023.209.1.40svn55435-52.1.noarch.rpm"
RPM_HASH = "69e708ca2cf2b037f0c08e621fbac22f0079e3c3cd8dbe378144dd501bba2d791dc3f630bba4c08e73d6bfe7ea8a004958ba2027e4f55c39045cec50f3af7440"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcrop"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Config \
perl-File--Copy \
perl-File--Spec \
perl-File--Spec--Functions \
perl-Getopt--Long \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdfcrop-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
