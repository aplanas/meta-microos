SUMMARY = "Free edition of the book 'TeX for the Impatient'"
DESCRIPTION = "'TeX for the Impatient' is a book (of around 350 pages) on TeX, \
Plain TeX and Eplain. The book is also available in French and \
Chinese translations."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.208.2020svn54080"

RPM_NAME = "texlive-impatient-2023.208.2020svn54080-53.1.noarch.rpm"
RPM_HASH = "8d53dcdcba0359e17cb9e75015ed0fd6c41fe9e46cd9cb43a0889c4e6b0db90b64e63b530a7f17b6e71b80157168bd14f4abfe42a5524da798f8f84a39a6114a"
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
