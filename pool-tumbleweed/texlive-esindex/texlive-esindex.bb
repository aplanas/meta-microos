SUMMARY = "Typset index entries in Spanish documents"
DESCRIPTION = "This package helps you to create indexes in Spanish. With \
esindex you can write, say, \\esindex{canon} and the entry will \
be correctly alphabetized in the index. This release of esindex \
works with accented characters in any encoding, and without \
babel."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn52342"

RPM_NAME = "texlive-esindex-2023.201.1.7svn52342-53.2.noarch.rpm"
RPM_HASH = "12532c7855709a9e0a02cc9172b7ef31610f57afbecd111f13966ac02bf6cc0748e8425fdd2bec56f4d63be2ee68cedca4f90d69e103a6df5619be6ccb9e434e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esindex.sty \
texlive-esindex"

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
