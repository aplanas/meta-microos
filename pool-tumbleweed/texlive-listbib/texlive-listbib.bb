SUMMARY = "Lists contents of BibTeX files"
DESCRIPTION = "Generates listings of bibliographic data bases in BibTeX format \
-- for example for archival purposes. Included is a listbib.bst \
which is better suited for this purpose than the standard \
styles."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.2svn29349"

RPM_NAME = "texlive-listbib-2023.201.2.2svn29349-54.1.noarch.rpm"
RPM_HASH = "ec2344961dbf6a083661dac47dbffd593aa4b82f5e6efd2b9b8379c33d4ea70cda44b359a768a1a2f3c2ba5fb64a78cff3fc74e4af4981b866badd81e1f0e1a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(listbib.cfg) \
tex(listbib.sty) \
tex(listbib.tex) \
texlive-listbib"

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
texlive-listbib-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
