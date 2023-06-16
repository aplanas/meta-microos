SUMMARY = "Makeindex working with Greek"
DESCRIPTION = "Makeindex is resolutely stuck with Latin-based alphabets, so \
will not deal with Greek indexes, unaided. This package \
provides a Perl script that will transmute the index of a Greek \
document in such a way that makeindex will sort the entries \
according to the rules of the Greek alphabet."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn26313"

RPM_NAME = "texlive-mkgrkindex-2023.201.2.0svn26313-54.1.noarch.rpm"
RPM_HASH = "d63cf77b55103842ea738fe0e9f11fe6ccff094cf5d20f65fa5436e375ab3dcc741137794bef029f7df62173b6b8eb2536909c4f8b35e8137cb94ee36cc46860"
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
