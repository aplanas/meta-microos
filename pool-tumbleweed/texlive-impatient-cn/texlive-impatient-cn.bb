SUMMARY = "Free edition of the book 'TeX for the Impatient'"
DESCRIPTION = "'TeX for the Impatient' is a book (of around 350 pages) on TeX, \
Plain TeX and Eplain. The book is also available in French and \
Chinese translations."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.2020svn54080"

RPM_NAME = "texlive-impatient-cn-2023.201.2020svn54080-52.1.noarch.rpm"
RPM_HASH = "8dc44e385a46f9de1e0e1a831ce3bd4546055eca4754702b38b1b9b260da642a75ded543df586f44e9eff6fb4edfc79d6607572cca9dbf546ca5bf157deaf2ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-impatient-cn"

RDEPENDS:${PN} += "/bin/sh \
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
