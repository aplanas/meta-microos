SUMMARY = "Free edition of the book 'TeX for the Impatient'"
DESCRIPTION = "'TeX for the Impatient' is a book (of around 350 pages) on TeX, \
Plain TeX and Eplain. The book is also available in French and \
Chinese translations."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.208.2020svn54080"

RPM_NAME = "texlive-impatient-fr-2023.208.2020svn54080-53.1.noarch.rpm"
RPM_HASH = "e3100c19ad6f68f19801e2e97e8bc4bd213443a2ba2243ff8909732792dc327d91cd983a65ef3ac146054a923b9e3701e23e93f3cd886b5e1038c2cfe8f561ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-impatient-fr"

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
