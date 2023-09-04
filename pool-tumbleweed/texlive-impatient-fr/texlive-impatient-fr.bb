SUMMARY = "Free edition of the book 'TeX for the Impatient'"
DESCRIPTION = "'TeX for the Impatient' is a book (of around 350 pages) on TeX, \
Plain TeX and Eplain. The book is also available in French and \
Chinese translations."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.2020svn54080"

RPM_NAME = "texlive-impatient-fr-2023.209.2020svn54080-54.1.noarch.rpm"
RPM_HASH = "0a94f28ebdee4e8c393a801a4239c1d00cd25d2feeb894542806b2f4540f892ff7c215d900393de666e6bc74d0f8682ecca6ea94ae88b81c1a661bed18a07544"
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
