SUMMARY = "Free edition of the book 'TeX for the Impatient'"
DESCRIPTION = "'TeX for the Impatient' is a book (of around 350 pages) on TeX, \
Plain TeX and Eplain. The book is also available in French and \
Chinese translations."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.2020svn54080"

RPM_NAME = "texlive-impatient-2023.201.2020svn54080-52.1.noarch.rpm"
RPM_HASH = "fd98a197fa4a8256f8bf2cd86fe73f04d831b7cf043ba9656c4895b2101d3e96b7623c632213e52bddfd6b3ae4be682dae8c2b07529b5f4a261ec185baabb479"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-impatient"
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
