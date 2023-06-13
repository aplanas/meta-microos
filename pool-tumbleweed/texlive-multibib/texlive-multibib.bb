SUMMARY = "Multiple bibliographies within one document"
DESCRIPTION = "The package the creation of references to multiple \
bibliographies within one document. It thus provides \
complementary functionality to packages like bibunits and \
chapterbib, which allow the creation of one bibliography for \
multiple, but different parts of the document. Multibib is \
compatible with inlinebib, natbib, and koma-script."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn15878"

RPM_NAME = "texlive-multibib-2023.201.1.4svn15878-54.1.noarch.rpm"
RPM_HASH = "72b5ab217754899fc05c278f43e51a8b20f3a5e2459d9202c9f3f3e8b9a9265dc717b67364826604d4b19b2939f7dd1c0dd0aa086f6ad6b9bccb2981d67ec3cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(multibib.sty) \
texlive-multibib"

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
