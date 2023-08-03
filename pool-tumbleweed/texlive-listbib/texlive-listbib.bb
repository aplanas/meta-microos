SUMMARY = "Lists contents of BibTeX files"
DESCRIPTION = "Generates listings of bibliographic data bases in BibTeX format \
-- for example for archival purposes. Included is a listbib.bst \
which is better suited for this purpose than the standard \
styles."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.2svn29349"

RPM_NAME = "texlive-listbib-2023.209.2.2svn29349-55.1.noarch.rpm"
RPM_HASH = "9589d613df1f24deb0e53eb82db685345cdf5cea1a418243b51ffdbdfa620568c04419aa5fe44d676647beb76bb20960e6e0d3c441c6bdb2e8297aa3f00955c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listbib.cfg \
tex-listbib.sty \
tex-listbib.tex \
texlive-listbib"

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
texlive-listbib-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
