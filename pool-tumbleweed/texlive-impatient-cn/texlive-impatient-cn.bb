SUMMARY = "Free edition of the book 'TeX for the Impatient'"
DESCRIPTION = "'TeX for the Impatient' is a book (of around 350 pages) on TeX, \
Plain TeX and Eplain. The book is also available in French and \
Chinese translations."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.208.2020svn54080"

RPM_NAME = "texlive-impatient-cn-2023.208.2020svn54080-53.1.noarch.rpm"
RPM_HASH = "be918e48109b6219398670c0944a0b6a2599830260da4bf9ede58406c12dd335bff579bf8214303ae7f5a79d886842582c538237eb12599af1402c31ca0438a7"
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
