SUMMARY = "Free edition of the book 'TeX for the Impatient'"
DESCRIPTION = "'TeX for the Impatient' is a book (of around 350 pages) on TeX, \
Plain TeX and Eplain. The book is also available in French and \
Chinese translations."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.2020svn54080"

RPM_NAME = "texlive-impatient-2023.209.2020svn54080-54.1.noarch.rpm"
RPM_HASH = "1acea397e934bd018046ae76f0613b1f5952da63e899ec23bb98905bb5e43d488d4bb7fea4c75d9623497aa9889bc06822fefb171c7c09f9fc606a4ab630c63c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-impatient"

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
