SUMMARY = "Free edition of the book 'TeX for the Impatient'"
DESCRIPTION = "'TeX for the Impatient' is a book (of around 350 pages) on TeX, \
Plain TeX and Eplain. The book is also available in French and \
Chinese translations."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.2020svn54080"

RPM_NAME = "texlive-impatient-cn-2023.209.2020svn54080-54.1.noarch.rpm"
RPM_HASH = "371c9c4eed863ce9251975a13619e4e2446e0b20dafe4df0192678332492193ab3231a1e4933e5656b2dd6e55f120d8f2acff53ed6d8c712bd6beadf78d05275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-impatient-cn"

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
