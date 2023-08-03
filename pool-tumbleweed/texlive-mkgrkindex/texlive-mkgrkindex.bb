SUMMARY = "Makeindex working with Greek"
DESCRIPTION = "Makeindex is resolutely stuck with Latin-based alphabets, so \
will not deal with Greek indexes, unaided. This package \
provides a Perl script that will transmute the index of a Greek \
document in such a way that makeindex will sort the entries \
according to the rules of the Greek alphabet."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn26313"

RPM_NAME = "texlive-mkgrkindex-2023.209.2.0svn26313-55.1.noarch.rpm"
RPM_HASH = "8a3e0285b79464eb1a5dc32952644cf8eab17450d3d1381cc2ff4965268b253182eaf224b600b33f69f9283f6920b37988a38fab4ea192db7f15eca01a7025b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mkgrkindex"

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
texlive-mkgrkindex-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
